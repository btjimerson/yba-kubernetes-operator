package xyz.pintobean.yba;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CloudProviderSpec {
    
    private String adminUser;
    private String name;
    private String zone;
    private String region;
    private Integer regionLatitude;
    private Integer regionLongitude;

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
