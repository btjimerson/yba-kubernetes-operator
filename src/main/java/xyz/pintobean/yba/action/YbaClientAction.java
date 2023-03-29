package xyz.pintobean.yba.action;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import xyz.pintobean.yba.domain.YbaProperties;

/**
 * Base class for YBA actions
 */
public abstract class YbaClientAction {
   
    private String apiToken;
    protected YbaProperties ybaArguments;
    
    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public YbaProperties getYbaArguments() {
        return ybaArguments;
    }

    public void setYbaArguments(YbaProperties ybaArguments) {
        this.ybaArguments = ybaArguments;
    }

    /**
     * Creates a valid base URL
     * @param hostname The hostname of YBA
     * @return A valid base URL
     */
    protected String normalizeHostname(String hostname) {
        return "http://" + hostname;
    }
    
    /**
     * Creates an HTTP entity with an API token header and request body
     * @param apiToken The API token to use
     * @param request The request body for the HTTP entity
     * @return An HTTP entity with the API token and request body
     */
    protected HttpEntity<Object> getHttpEntity(String apiToken, Object request) {
		HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		httpHeaders.set("X-AUTH-YW-API-TOKEN", apiToken);

		HttpEntity<Object> httpEntity = new HttpEntity<>(request, httpHeaders);
		return httpEntity;
	}

    /**
     * Creates an HTTP entity with an API token header and no request body
     * @param apiToken The API token to use
     * @return An HTTP entity with the API token and empty request body
     */
    protected HttpEntity<Object> getHttpEntity(String apiToken) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        httpHeaders.set("X-AUTH-YW-API-TOKEN", apiToken);
        
        HttpEntity<Object> httpEntity = new HttpEntity<>(httpHeaders);
        return httpEntity;
    }


}
