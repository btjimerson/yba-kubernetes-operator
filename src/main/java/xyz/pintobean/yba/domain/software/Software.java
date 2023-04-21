
package xyz.pintobean.yba.domain.software;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "taskType",
    "upgradeOption",
    "ybSoftwareVersion",
    "universeUUID",
    "nodePrefix",
    "clusters",
    "sleepAfterMasterRestartMillis",
    "sleepAfterTServerRestartMillis",
    "enableYbc"
})
@Generated("jsonschema2pojo")
public class Software {

    @JsonProperty("taskType")
    private String taskType;
    @JsonProperty("upgradeOption")
    private String upgradeOption;
    @JsonProperty("ybSoftwareVersion")
    private String ybSoftwareVersion;
    @JsonProperty("universeUUID")
    private String universeUUID;
    @JsonProperty("nodePrefix")
    private String nodePrefix;
    @JsonProperty("clusters")
    private List<Cluster> clusters;
    @JsonProperty("sleepAfterMasterRestartMillis")
    private Integer sleepAfterMasterRestartMillis;
    @JsonProperty("sleepAfterTServerRestartMillis")
    private Integer sleepAfterTServerRestartMillis;
    @JsonProperty("enableYbc")
    private Boolean enableYbc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Software() {
    }

    /**
     * 
     * @param universeUUID
     * @param taskType
     * @param upgradeOption
     * @param ybSoftwareVersion
     * @param nodePrefix
     * @param sleepAfterMasterRestartMillis
     * @param clusters
     * @param sleepAfterTServerRestartMillis
     * @param enableYbc
     */
    public Software(String taskType, String upgradeOption, String ybSoftwareVersion, String universeUUID, String nodePrefix, List<Cluster> clusters, Integer sleepAfterMasterRestartMillis, Integer sleepAfterTServerRestartMillis, Boolean enableYbc) {
        super();
        this.taskType = taskType;
        this.upgradeOption = upgradeOption;
        this.ybSoftwareVersion = ybSoftwareVersion;
        this.universeUUID = universeUUID;
        this.nodePrefix = nodePrefix;
        this.clusters = clusters;
        this.sleepAfterMasterRestartMillis = sleepAfterMasterRestartMillis;
        this.sleepAfterTServerRestartMillis = sleepAfterTServerRestartMillis;
        this.enableYbc = enableYbc;
    }

    @JsonProperty("taskType")
    public String getTaskType() {
        return taskType;
    }

    @JsonProperty("taskType")
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @JsonProperty("upgradeOption")
    public String getUpgradeOption() {
        return upgradeOption;
    }

    @JsonProperty("upgradeOption")
    public void setUpgradeOption(String upgradeOption) {
        this.upgradeOption = upgradeOption;
    }

    @JsonProperty("ybSoftwareVersion")
    public String getYbSoftwareVersion() {
        return ybSoftwareVersion;
    }

    @JsonProperty("ybSoftwareVersion")
    public void setYbSoftwareVersion(String ybSoftwareVersion) {
        this.ybSoftwareVersion = ybSoftwareVersion;
    }

    @JsonProperty("universeUUID")
    public String getUniverseUUID() {
        return universeUUID;
    }

    @JsonProperty("universeUUID")
    public void setUniverseUUID(String universeUUID) {
        this.universeUUID = universeUUID;
    }

    @JsonProperty("nodePrefix")
    public String getNodePrefix() {
        return nodePrefix;
    }

    @JsonProperty("nodePrefix")
    public void setNodePrefix(String nodePrefix) {
        this.nodePrefix = nodePrefix;
    }

    @JsonProperty("clusters")
    public List<Cluster> getClusters() {
        return clusters;
    }

    @JsonProperty("clusters")
    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }

    @JsonProperty("sleepAfterMasterRestartMillis")
    public Integer getSleepAfterMasterRestartMillis() {
        return sleepAfterMasterRestartMillis;
    }

    @JsonProperty("sleepAfterMasterRestartMillis")
    public void setSleepAfterMasterRestartMillis(Integer sleepAfterMasterRestartMillis) {
        this.sleepAfterMasterRestartMillis = sleepAfterMasterRestartMillis;
    }

    @JsonProperty("sleepAfterTServerRestartMillis")
    public Integer getSleepAfterTServerRestartMillis() {
        return sleepAfterTServerRestartMillis;
    }

    @JsonProperty("sleepAfterTServerRestartMillis")
    public void setSleepAfterTServerRestartMillis(Integer sleepAfterTServerRestartMillis) {
        this.sleepAfterTServerRestartMillis = sleepAfterTServerRestartMillis;
    }

    @JsonProperty("enableYbc")
    public Boolean getEnableYbc() {
        return enableYbc;
    }

    @JsonProperty("enableYbc")
    public void setEnableYbc(Boolean enableYbc) {
        this.enableYbc = enableYbc;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Software.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("taskType");
        sb.append('=');
        sb.append(((this.taskType == null)?"<null>":this.taskType));
        sb.append(',');
        sb.append("upgradeOption");
        sb.append('=');
        sb.append(((this.upgradeOption == null)?"<null>":this.upgradeOption));
        sb.append(',');
        sb.append("ybSoftwareVersion");
        sb.append('=');
        sb.append(((this.ybSoftwareVersion == null)?"<null>":this.ybSoftwareVersion));
        sb.append(',');
        sb.append("universeUUID");
        sb.append('=');
        sb.append(((this.universeUUID == null)?"<null>":this.universeUUID));
        sb.append(',');
        sb.append("nodePrefix");
        sb.append('=');
        sb.append(((this.nodePrefix == null)?"<null>":this.nodePrefix));
        sb.append(',');
        sb.append("clusters");
        sb.append('=');
        sb.append(((this.clusters == null)?"<null>":this.clusters));
        sb.append(',');
        sb.append("sleepAfterMasterRestartMillis");
        sb.append('=');
        sb.append(((this.sleepAfterMasterRestartMillis == null)?"<null>":this.sleepAfterMasterRestartMillis));
        sb.append(',');
        sb.append("sleepAfterTServerRestartMillis");
        sb.append('=');
        sb.append(((this.sleepAfterTServerRestartMillis == null)?"<null>":this.sleepAfterTServerRestartMillis));
        sb.append(',');
        sb.append("enableYbc");
        sb.append('=');
        sb.append(((this.enableYbc == null)?"<null>":this.enableYbc));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.universeUUID == null)? 0 :this.universeUUID.hashCode()));
        result = ((result* 31)+((this.taskType == null)? 0 :this.taskType.hashCode()));
        result = ((result* 31)+((this.upgradeOption == null)? 0 :this.upgradeOption.hashCode()));
        result = ((result* 31)+((this.ybSoftwareVersion == null)? 0 :this.ybSoftwareVersion.hashCode()));
        result = ((result* 31)+((this.nodePrefix == null)? 0 :this.nodePrefix.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sleepAfterMasterRestartMillis == null)? 0 :this.sleepAfterMasterRestartMillis.hashCode()));
        result = ((result* 31)+((this.clusters == null)? 0 :this.clusters.hashCode()));
        result = ((result* 31)+((this.sleepAfterTServerRestartMillis == null)? 0 :this.sleepAfterTServerRestartMillis.hashCode()));
        result = ((result* 31)+((this.enableYbc == null)? 0 :this.enableYbc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Software) == false) {
            return false;
        }
        Software rhs = ((Software) other);
        return (((((((((((this.universeUUID == rhs.universeUUID)||((this.universeUUID!= null)&&this.universeUUID.equals(rhs.universeUUID)))&&((this.taskType == rhs.taskType)||((this.taskType!= null)&&this.taskType.equals(rhs.taskType))))&&((this.upgradeOption == rhs.upgradeOption)||((this.upgradeOption!= null)&&this.upgradeOption.equals(rhs.upgradeOption))))&&((this.ybSoftwareVersion == rhs.ybSoftwareVersion)||((this.ybSoftwareVersion!= null)&&this.ybSoftwareVersion.equals(rhs.ybSoftwareVersion))))&&((this.nodePrefix == rhs.nodePrefix)||((this.nodePrefix!= null)&&this.nodePrefix.equals(rhs.nodePrefix))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sleepAfterMasterRestartMillis == rhs.sleepAfterMasterRestartMillis)||((this.sleepAfterMasterRestartMillis!= null)&&this.sleepAfterMasterRestartMillis.equals(rhs.sleepAfterMasterRestartMillis))))&&((this.clusters == rhs.clusters)||((this.clusters!= null)&&this.clusters.equals(rhs.clusters))))&&((this.sleepAfterTServerRestartMillis == rhs.sleepAfterTServerRestartMillis)||((this.sleepAfterTServerRestartMillis!= null)&&this.sleepAfterTServerRestartMillis.equals(rhs.sleepAfterTServerRestartMillis))))&&((this.enableYbc == rhs.enableYbc)||((this.enableYbc!= null)&&this.enableYbc.equals(rhs.enableYbc))));
    }

}
