package xyz.pintobean.yba.domain;

public class UniverseKubernetesEntity {
    
    private String customerUuid;
    private String name;
    private String providerUuid;
    private Integer replicationFactor;
    private String softwareVersion;
    private String storageClass;
    private Integer volumeSize;
    private String ycqlPassword;
    private String ysqlPassword;

    public String getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProviderUuid() {
        return providerUuid;
    }

    public void setProviderUuid(String providerUuid) {
        this.providerUuid = providerUuid;
    }

    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public String getYcqlPassword() {
        return ycqlPassword;
    }

    public void setYcqlPassword(String ycqlPassword) {
        this.ycqlPassword = ycqlPassword;
    }

    public String getYsqlPassword() {
        return ysqlPassword;
    }
    
    public void setYsqlPassword(String ysqlPassword) {
        this.ysqlPassword = ysqlPassword;
    }

    
}
