package xyz.pintobean.yba.domain;

public class CloudProviderKubernetesEntity {
 
    private String adminUser;
    private String customerUuid;
    private String kubeconfig;
    private String name;
    private String namespace;
    private String region;
    private Integer regionLatitude;
    private Integer regionLongitude;
    private String zone;
    
    public String getAdminUser() {
        return adminUser;
    }
    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }
    public String getCustomerUuid() {
        return customerUuid;
    }
    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }
    public String getKubeconfig() {
        return kubeconfig;
    }
    public void setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
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
    public String getZone() {
        return zone;
    }
    public void setZone(String zone) {
        this.zone = zone;
    }

}
