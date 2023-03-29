package xyz.pintobean.yba.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import xyz.pintobean.yba.domain.AdminUserKubernetesEntity;
import xyz.pintobean.yba.domain.user.AdminUser;
import xyz.pintobean.yba.domain.user.Customer;

/**
 * Registers the admin user
 */
public class RegisterAdminUserAction extends YbaClientAction {

    private static final Log LOG = LogFactory.getLog(RegisterAdminUserAction.class);
    
    /**
     * Runs the register admin user action
     */
    public Map<String, String> runAction(AdminUserKubernetesEntity adminUser) {

        Map<String, String> result = new HashMap<String, String>();
        StringBuilder url = new StringBuilder();
        RestTemplate restTemplate = new RestTemplate();

        //Check to see if user exists
        if (this.getApiToken() != null) {
            //Build request URL
            url.append(normalizeHostname(ybaArguments.getHostname()));
            url.append("/api/v1/customers");
            LOG.debug(String.format("URL created = [%s]", url.toString()));

            //API call
            HttpEntity<Object> httpEntity = this.getHttpEntity(this.getApiToken());
            LOG.info(String.format("Sending List Customers request to %s", url.toString()));
            ResponseEntity<Customer[]> customersResponseEntity = restTemplate.exchange(
                url.toString(),
                HttpMethod.GET, 
                httpEntity,
                Customer[].class
            );
            Customer[] existingCustomers = customersResponseEntity.getBody();
            if (existingCustomers != null && existingCustomers.length > 0) {
                LOG.info(
                    String.format(
                        "Admin user already exists with uuid [%s]. Returning existing user.",
                        existingCustomers[0].getUuid()));
                result.put("result", "admin user already exists");
                result.put("customerUuid", existingCustomers[0].getUuid());
                return result;
            }
        }
        //End check for existing user
        
        //Build request URL
        url = new StringBuilder();
        url.append(normalizeHostname(ybaArguments.getHostname()));
        url.append("/api/v1/register?generateApiToken=true");
        LOG.debug(String.format("URL created = [%s]", url.toString()));

        AdminUser user = new AdminUser();
        user.setCode(adminUser.getEnvironment());
        user.setConfirmEULA(Boolean.TRUE);
        user.setConfirmPassword(adminUser.getPassword());
        user.setEmail(adminUser.getEmail());
        user.setName(adminUser.getFullName());
        user.setPassword(adminUser.getPassword());

        //API call
        LOG.info(String.format("Sending Register Admin request to %s", url.toString()));
        String response = restTemplate.postForObject(
            url.toString(), 
            user, 
            String.class
        );
        LOG.debug(String.format("Response for register admin = [%s]", response));

        
        JSONObject jsonObject = new JSONObject(response);

        //Return values
        result.put("result", "success");
        result.put("apiToken", jsonObject.getString("apiToken"));
        result.put("customerUuid", jsonObject.getString("customerUUID"));
        result.put("userUuid", jsonObject.getString("userUUID"));
        return result;

    }

}
