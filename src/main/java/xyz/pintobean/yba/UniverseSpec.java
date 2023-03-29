package xyz.pintobean.yba;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UniverseSpec {
    
    private String name;
    private String softwareVersion;
    private String storageClass;
    private Integer replicationFactor;
    private Integer volumeSize;
    private String ycqlPassword;
    private String ysqlPassword;
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
