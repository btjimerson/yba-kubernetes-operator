package xyz.pintobean.yba.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import xyz.pintobean.yba.domain.SoftwareKubernetesEntity;
import xyz.pintobean.yba.domain.software.Software;

/**
 * Upgrades an existing YBA universe
 */
public class UpgradeUniverseAction extends YbaClientAction {

	private static final Log LOG = LogFactory.getLog(UpgradeUniverseAction.class);
	/**
	 * Runs this action
	 * @param entity The transfer object
	 * @return A map of results
	 */
	public Map<String, String> runAction(SoftwareKubernetesEntity entity) {

		Map<String, String> results = new HashMap<String, String>();

		StringBuilder helmCommand = new StringBuilder();
		helmCommand.append("helm upgrade yugaware yugabytedb/yugaware --version ");
		helmCommand.append(entity.getChartVersion());
		helmCommand.append(" -n yugabyte --set istioCompatibility.enabled=true --set image.tag=");
		helmCommand.append(entity.getSoftwareVersion());
		helmCommand.append(" --wait");
		
		try {
			Process process = Runtime.getRuntime().exec(new String[]{helmCommand.toString()});
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuffer output = new StringBuffer();
			String line = "";
			while ((line = reader.readLine()) != null) {
				output.append(line);
			}
			results.put("helm-result", output.toString());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// Build request URL
		StringBuilder url = new StringBuilder();
        url.append(normalizeHostname(ybaArguments.getHostname()));
        url.append("/api/v1/customers/");
        url.append(entity.getCustomerUuid());
        url.append("/universes/");
		url.append(entity.getUniverseUuid());
		url.append("/upgrade/software");

		// Build request body
		Software software = new Software();
		software.setNodePrefix("yb-dev" + entity.getName());
		software.setUniverseUUID(entity.getUniverseUuid());
		software.setUpgradeOption("Rolling");
		software.setTaskType("Software");
		software.setYbSoftwareVersion(entity.getSoftwareVersion());

		//API call
		HttpEntity<Object> httpEntity = this.getHttpEntity(
			this.getApiToken(),
			software
		);
		LOG.info(String.format("Sending Create Universe request to %s", url.toString()));
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.postForObject(
			url.toString(), 
			httpEntity, 
			String.class)
		;
		LOG.debug(String.format("Response for create universe = [%s]", response));

		//Return values
		JSONObject jsonObject = new JSONObject(response);
		results.put("result", "success");
		results.put("universeUuid", jsonObject.getString("resourceUUID"));
		results.put("taskUuid", jsonObject.getString("taskUUID"));

		return results;
	}
}
