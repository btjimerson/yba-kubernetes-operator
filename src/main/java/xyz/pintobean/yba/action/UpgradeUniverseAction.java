package xyz.pintobean.yba.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import xyz.pintobean.yba.domain.SoftwareKubernetesEntity;
import xyz.pintobean.yba.domain.provider.ExistingProvider;
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
		helmCommand.append("/usr/local/bin/helm upgrade yugaware yugabytedb/yugaware --version ");
		helmCommand.append(entity.getChartVersion());
		helmCommand.append(" -n yugabyte --set istioCompatibility.enabled=true --set image.tag=");
		helmCommand.append(entity.getSoftwareVersion());
		helmCommand.append(" --set multicluster.createServicePerPod=true --wait");
		
		try {
			LOG.info(String.format("Executing command [%s].", helmCommand));
			Process helm = Runtime.getRuntime().exec(new String[]{"sh", "-c", helmCommand.toString()});
			BufferedReader reader = new BufferedReader(new InputStreamReader(helm.getInputStream()));
			StringBuffer output = new StringBuffer();
			String line = "";
			while ((line = reader.readLine()) != null) {
				output.append(line);
			}
			reader = new BufferedReader(new InputStreamReader(helm.getErrorStream()));
			StringBuffer error = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				error.append(line);
			}
			if (error.toString() != null && error.toString().length() > 0) {
				throw new RuntimeException(String.format("Error executing helm upgrade. %s", error.toString()));
			} else {
				LOG.info(String.format("Result from helm upgrade command: [%s]", output.toString()));
				results.put("helm-result", output.toString());
			}
		} catch (IOException ioe) {
			LOG.error("Error executing helm upgrade.", ioe);
			throw new RuntimeException(ioe);
		}

		// Wait for YBA to come back up
		StringBuilder url = new StringBuilder();
		url.append(normalizeHostname(ybaArguments.getHostname()));
		HttpEntity<Object> httpEntity = this.getHttpEntity(this.getApiToken());
		RestTemplate restTemplate = new RestTemplate();
        LOG.info(String.format("Checking YBA health at URL %s", url.toString()));
		boolean isError = true;
		while (isError) {
			ResponseEntity<String> ybaHealthEntity = restTemplate.exchange(
				url.toString(),
				HttpMethod.GET,
				httpEntity,
				String.class
			);
			isError = ybaHealthEntity.getStatusCode().isError();
			LOG.info(String.format("YBA is not available yet. URL is %s. Response is %s...", 
					url, ybaHealthEntity.getStatusCode()));
		}

		// Build request URL
		url = new StringBuilder();
        url.append(normalizeHostname(ybaArguments.getHostname()));
        url.append("/api/v1/customers/");
        url.append(entity.getCustomerUuid());
        url.append("/universes/");
		url.append(entity.getUniverseUuid());
		url.append("/upgrade/software");

		// Build request body
		Software software = new Software();
		software.setEnableYbc(entity.getEnableYbc());
		software.setNodePrefix("yb-DEV-" + entity.getName());
		software.setSleepAfterMasterRestartMillis(entity.getSleepAfterMasterRestartMillis());
		software.setSleepAfterTServerRestartMillis(entity.getSleepAfterTServerRestartMillis());
		software.setTaskType(entity.getTaskType());
		software.setUniverseUUID(entity.getUniverseUuid());
		software.setUpgradeOption(entity.getUpgradeOption());
		software.setYbSoftwareVersion(entity.getSoftwareVersion());

		//API call
		httpEntity = this.getHttpEntity(
			this.getApiToken(),
			software
		);
		LOG.info(String.format("Sending Upgrade Universe request to %s", url.toString()));
		restTemplate = new RestTemplate();
		String response = restTemplate.postForObject(
			url.toString(), 
			httpEntity, 
			String.class)
		;
		LOG.debug(String.format("Response for upgrade universe = [%s]", response));

		//Return values
		JSONObject jsonObject = new JSONObject(response);
		results.put("result", "success");
		results.put("universeUuid", jsonObject.getString("resourceUUID"));
		results.put("taskUuid", jsonObject.getString("taskUUID"));

		return results;
	}
}
