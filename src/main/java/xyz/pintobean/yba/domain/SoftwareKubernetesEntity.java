package xyz.pintobean.yba.domain;

public class SoftwareKubernetesEntity {
    
    private String chartVersion;
    private String customerUuid;
    private Boolean enableYbc;
    private String name;
    private Integer sleepAfterMasterRestartMillis;
    private Integer sleepAfterTServerRestartMillis;
    private String softwareVersion;
    private String taskType;
    private String upgradeOption;
    private String universeUuid;

    public String getChartVersion() {
        return chartVersion;
    }

    public void setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
    }

    public String getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }

    public Boolean getEnableYbc() {
        return enableYbc;
    }

    public void setEnableYbc(Boolean enableYbc) {
        this.enableYbc = enableYbc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSleepAfterMasterRestartMillis() {
        return sleepAfterMasterRestartMillis;
    }

    public void setSleepAfterMasterRestartMillis(Integer sleepAfterMasterRestartMillis) {
        this.sleepAfterMasterRestartMillis = sleepAfterMasterRestartMillis;
    }

    public Integer getSleepAfterTServerRestartMillis() {
        return sleepAfterTServerRestartMillis;
    }

    public void setSleepAfterTServerRestartMillis(Integer sleepAfterTServerRestartMillis) {
        this.sleepAfterTServerRestartMillis = sleepAfterTServerRestartMillis;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getUpgradeOption() {
        return upgradeOption;
    }

    public void setUpgradeOption(String upgradeOption) {
        this.upgradeOption = upgradeOption;
    }

    public String getUniverseUuid() {
        return universeUuid;
    }

    public void setUniverseUuid(String universeUuid) {
        this.universeUuid = universeUuid;
    }
}
