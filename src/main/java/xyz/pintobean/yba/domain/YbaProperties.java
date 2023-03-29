package xyz.pintobean.yba.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="yba")
public class YbaProperties {

    private String apiToken; 
    private String environment;
    private String hostname;
    private String kubeconfigPath; 
    private String namespace;
    private String providerName; 
    private String pullSecretName; 
    private String pullSecretPath; 
    private String region; 
    private Integer regionLatitude;
    private Integer regionLongitude;
    private String serviceAccount;
    private String storageClass; 
    private String universeName;
    private String ybSoftwareVersion;
    private String zone;

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getKubeconfigPath() {
        return kubeconfigPath;
    }

    public void setKubeconfigPath(String kubeconfigPath) {
        this.kubeconfigPath = kubeconfigPath;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getPullSecretName() {
        return pullSecretName;
    }

    public void setPullSecretName(String pullSecretName) {
        this.pullSecretName = pullSecretName;
    }

    public String getPullSecretPath() {
        return pullSecretPath;
    }

    public void setPullSecretPath(String pullSecretPath) {
        this.pullSecretPath = pullSecretPath;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getRegionLatitude() {
        return regionLatitude;
    }

    public void setRegionLatitude(Integer regionLatitude) {
        this.regionLatitude = regionLatitude;
    }

    public Integer getRegionLongitude() {
        return regionLongitude;
    }

    public void setRegionLongitude(Integer regionLongitude) {
        this.regionLongitude = regionLongitude;
    }

    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public String getUniverseName() {
        return universeName;
    }

    public void setUniverseName(String universeName) {
        this.universeName = universeName;
    }

    public String getYbSoftwareVersion() {
        return ybSoftwareVersion;
    }

    public void setYbSoftwareVersion(String ybSoftwareVersion) {
        this.ybSoftwareVersion = ybSoftwareVersion;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

}