package xyz.pintobean.yba.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="yba")
public class YbaProperties {

    private String hostname;
    private String providerName;
    private String pullSecretName; 
    private String pullSecretPath; 
    private String serviceAccount;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
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

    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }


}