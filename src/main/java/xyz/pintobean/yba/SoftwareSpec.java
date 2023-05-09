package xyz.pintobean.yba;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SoftwareSpec {

    private String chartVersion;
    private Boolean enableYbc;
    private String name;
    private Integer sleepAfterMasterRestartMillis;
    private Integer sleepAfterTServerRestartMillis;
    private String softwareVersion;
    private String taskType;
    private String upgradeOption;

    public String getChartVersion() {
        return chartVersion;
    }

    public void setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}
