
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
    "universeName",
    "provider",
    "providerType",
    "replicationFactor",
    "regionList",
    "instanceType",
    "numNodes",
    "ybSoftwareVersion",
    "accessKeyCode",
    "deviceInfo",
    "assignPublicIP",
    "assignStaticPublicIP",
    "useTimeSync",
    "enableYCQL",
    "ysqlPassword",
    "enableYSQLAuth",
    "enableYCQLAuth",
    "enableYSQL",
    "enableYEDIS",
    "enableNodeToNodeEncrypt",
    "enableClientToNodeEncrypt",
    "enableVolumeEncryption",
    "enableIPV6",
    "enableExposingService",
    "awsArnString",
    "useHostname",
    "masterGFlags",
    "tserverGFlags",
    "ybcFlags",
    "instanceTags",
    "dedicatedNodes"
})
@Generated("jsonschema2pojo")
public class UserIntent {

    @JsonProperty("universeName")
    private String universeName;
    @JsonProperty("provider")
    private String provider;
    @JsonProperty("providerType")
    private String providerType;
    @JsonProperty("replicationFactor")
    private Integer replicationFactor;
    @JsonProperty("regionList")
    private List<String> regionList;
    @JsonProperty("instanceType")
    private String instanceType;
    @JsonProperty("numNodes")
    private Integer numNodes;
    @JsonProperty("ybSoftwareVersion")
    private String ybSoftwareVersion;
    @JsonProperty("accessKeyCode")
    private String accessKeyCode;
    @JsonProperty("deviceInfo")
    private DeviceInfo deviceInfo;
    @JsonProperty("assignPublicIP")
    private Boolean assignPublicIP;
    @JsonProperty("assignStaticPublicIP")
    private Boolean assignStaticPublicIP;
    @JsonProperty("useTimeSync")
    private Boolean useTimeSync;
    @JsonProperty("enableYCQL")
    private Boolean enableYCQL;
    @JsonProperty("ysqlPassword")
    private String ysqlPassword;
    @JsonProperty("enableYSQLAuth")
    private Boolean enableYSQLAuth;
    @JsonProperty("enableYCQLAuth")
    private Boolean enableYCQLAuth;
    @JsonProperty("enableYSQL")
    private Boolean enableYSQL;
    @JsonProperty("enableYEDIS")
    private Boolean enableYEDIS;
    @JsonProperty("enableNodeToNodeEncrypt")
    private Boolean enableNodeToNodeEncrypt;
    @JsonProperty("enableClientToNodeEncrypt")
    private Boolean enableClientToNodeEncrypt;
    @JsonProperty("enableVolumeEncryption")
    private Boolean enableVolumeEncryption;
    @JsonProperty("enableIPV6")
    private Boolean enableIPV6;
    @JsonProperty("enableExposingService")
    private String enableExposingService;
    @JsonProperty("awsArnString")
    private String awsArnString;
    @JsonProperty("useHostname")
    private Boolean useHostname;
    @JsonProperty("masterGFlags")
    private List<Object> masterGFlags;
    @JsonProperty("tserverGFlags")
    private List<Object> tserverGFlags;
    @JsonProperty("ybcFlags")
    private YbcFlags ybcFlags;
    @JsonProperty("instanceTags")
    private InstanceTags instanceTags;
    @JsonProperty("dedicatedNodes")
    private Boolean dedicatedNodes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserIntent() {
    }

    /**
     * 
     * @param replicationFactor
     * @param enableNodeToNodeEncrypt
     * @param enableYCQLAuth
     * @param instanceTags
     * @param providerType
     * @param tserverGFlags
     * @param ysqlPassword
     * @param enableYEDIS
     * @param provider
     * @param enableVolumeEncryption
     * @param accessKeyCode
     * @param enableYSQLAuth
     * @param enableIPV6
     * @param universeName
     * @param dedicatedNodes
     * @param ybcFlags
     * @param assignStaticPublicIP
     * @param enableYSQL
     * @param useTimeSync
     * @param regionList
     * @param useHostname
     * @param instanceType
     * @param ybSoftwareVersion
     * @param deviceInfo
     * @param numNodes
     * @param enableYCQL
     * @param assignPublicIP
     * @param enableClientToNodeEncrypt
     * @param awsArnString
     * @param enableExposingService
     * @param masterGFlags
     */
    public UserIntent(String universeName, String provider, String providerType, Integer replicationFactor, List<String> regionList, String instanceType, Integer numNodes, String ybSoftwareVersion, String accessKeyCode, DeviceInfo deviceInfo, Boolean assignPublicIP, Boolean assignStaticPublicIP, Boolean useTimeSync, Boolean enableYCQL, String ysqlPassword, Boolean enableYSQLAuth, Boolean enableYCQLAuth, Boolean enableYSQL, Boolean enableYEDIS, Boolean enableNodeToNodeEncrypt, Boolean enableClientToNodeEncrypt, Boolean enableVolumeEncryption, Boolean enableIPV6, String enableExposingService, String awsArnString, Boolean useHostname, List<Object> masterGFlags, List<Object> tserverGFlags, YbcFlags ybcFlags, InstanceTags instanceTags, Boolean dedicatedNodes) {
        super();
        this.universeName = universeName;
        this.provider = provider;
        this.providerType = providerType;
        this.replicationFactor = replicationFactor;
        this.regionList = regionList;
        this.instanceType = instanceType;
        this.numNodes = numNodes;
        this.ybSoftwareVersion = ybSoftwareVersion;
        this.accessKeyCode = accessKeyCode;
        this.deviceInfo = deviceInfo;
        this.assignPublicIP = assignPublicIP;
        this.assignStaticPublicIP = assignStaticPublicIP;
        this.useTimeSync = useTimeSync;
        this.enableYCQL = enableYCQL;
        this.ysqlPassword = ysqlPassword;
        this.enableYSQLAuth = enableYSQLAuth;
        this.enableYCQLAuth = enableYCQLAuth;
        this.enableYSQL = enableYSQL;
        this.enableYEDIS = enableYEDIS;
        this.enableNodeToNodeEncrypt = enableNodeToNodeEncrypt;
        this.enableClientToNodeEncrypt = enableClientToNodeEncrypt;
        this.enableVolumeEncryption = enableVolumeEncryption;
        this.enableIPV6 = enableIPV6;
        this.enableExposingService = enableExposingService;
        this.awsArnString = awsArnString;
        this.useHostname = useHostname;
        this.masterGFlags = masterGFlags;
        this.tserverGFlags = tserverGFlags;
        this.ybcFlags = ybcFlags;
        this.instanceTags = instanceTags;
        this.dedicatedNodes = dedicatedNodes;
    }

    @JsonProperty("universeName")
    public String getUniverseName() {
        return universeName;
    }

    @JsonProperty("universeName")
    public void setUniverseName(String universeName) {
        this.universeName = universeName;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(String provider) {
        this.provider = provider;
    }

    @JsonProperty("providerType")
    public String getProviderType() {
        return providerType;
    }

    @JsonProperty("providerType")
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    @JsonProperty("replicationFactor")
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    @JsonProperty("replicationFactor")
    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    @JsonProperty("regionList")
    public List<String> getRegionList() {
        return regionList;
    }

    @JsonProperty("regionList")
    public void setRegionList(List<String> regionList) {
        this.regionList = regionList;
    }

    @JsonProperty("instanceType")
    public String getInstanceType() {
        return instanceType;
    }

    @JsonProperty("instanceType")
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @JsonProperty("numNodes")
    public Integer getNumNodes() {
        return numNodes;
    }

    @JsonProperty("numNodes")
    public void setNumNodes(Integer numNodes) {
        this.numNodes = numNodes;
    }

    @JsonProperty("ybSoftwareVersion")
    public String getYbSoftwareVersion() {
        return ybSoftwareVersion;
    }

    @JsonProperty("ybSoftwareVersion")
    public void setYbSoftwareVersion(String ybSoftwareVersion) {
        this.ybSoftwareVersion = ybSoftwareVersion;
    }

    @JsonProperty("accessKeyCode")
    public String getAccessKeyCode() {
        return accessKeyCode;
    }

    @JsonProperty("accessKeyCode")
    public void setAccessKeyCode(String accessKeyCode) {
        this.accessKeyCode = accessKeyCode;
    }

    @JsonProperty("deviceInfo")
    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    @JsonProperty("deviceInfo")
    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    @JsonProperty("assignPublicIP")
    public Boolean getAssignPublicIP() {
        return assignPublicIP;
    }

    @JsonProperty("assignPublicIP")
    public void setAssignPublicIP(Boolean assignPublicIP) {
        this.assignPublicIP = assignPublicIP;
    }

    @JsonProperty("assignStaticPublicIP")
    public Boolean getAssignStaticPublicIP() {
        return assignStaticPublicIP;
    }

    @JsonProperty("assignStaticPublicIP")
    public void setAssignStaticPublicIP(Boolean assignStaticPublicIP) {
        this.assignStaticPublicIP = assignStaticPublicIP;
    }

    @JsonProperty("useTimeSync")
    public Boolean getUseTimeSync() {
        return useTimeSync;
    }

    @JsonProperty("useTimeSync")
    public void setUseTimeSync(Boolean useTimeSync) {
        this.useTimeSync = useTimeSync;
    }

    @JsonProperty("enableYCQL")
    public Boolean getEnableYCQL() {
        return enableYCQL;
    }

    @JsonProperty("enableYCQL")
    public void setEnableYCQL(Boolean enableYCQL) {
        this.enableYCQL = enableYCQL;
    }

    @JsonProperty("ysqlPassword")
    public String getYsqlPassword() {
        return ysqlPassword;
    }

    @JsonProperty("ysqlPassword")
    public void setYsqlPassword(String ysqlPassword) {
        this.ysqlPassword = ysqlPassword;
    }

    @JsonProperty("enableYSQLAuth")
    public Boolean getEnableYSQLAuth() {
        return enableYSQLAuth;
    }

    @JsonProperty("enableYSQLAuth")
    public void setEnableYSQLAuth(Boolean enableYSQLAuth) {
        this.enableYSQLAuth = enableYSQLAuth;
    }

    @JsonProperty("enableYCQLAuth")
    public Boolean getEnableYCQLAuth() {
        return enableYCQLAuth;
    }

    @JsonProperty("enableYCQLAuth")
    public void setEnableYCQLAuth(Boolean enableYCQLAuth) {
        this.enableYCQLAuth = enableYCQLAuth;
    }

    @JsonProperty("enableYSQL")
    public Boolean getEnableYSQL() {
        return enableYSQL;
    }

    @JsonProperty("enableYSQL")
    public void setEnableYSQL(Boolean enableYSQL) {
        this.enableYSQL = enableYSQL;
    }

    @JsonProperty("enableYEDIS")
    public Boolean getEnableYEDIS() {
        return enableYEDIS;
    }

    @JsonProperty("enableYEDIS")
    public void setEnableYEDIS(Boolean enableYEDIS) {
        this.enableYEDIS = enableYEDIS;
    }

    @JsonProperty("enableNodeToNodeEncrypt")
    public Boolean getEnableNodeToNodeEncrypt() {
        return enableNodeToNodeEncrypt;
    }

    @JsonProperty("enableNodeToNodeEncrypt")
    public void setEnableNodeToNodeEncrypt(Boolean enableNodeToNodeEncrypt) {
        this.enableNodeToNodeEncrypt = enableNodeToNodeEncrypt;
    }

    @JsonProperty("enableClientToNodeEncrypt")
    public Boolean getEnableClientToNodeEncrypt() {
        return enableClientToNodeEncrypt;
    }

    @JsonProperty("enableClientToNodeEncrypt")
    public void setEnableClientToNodeEncrypt(Boolean enableClientToNodeEncrypt) {
        this.enableClientToNodeEncrypt = enableClientToNodeEncrypt;
    }

    @JsonProperty("enableVolumeEncryption")
    public Boolean getEnableVolumeEncryption() {
        return enableVolumeEncryption;
    }

    @JsonProperty("enableVolumeEncryption")
    public void setEnableVolumeEncryption(Boolean enableVolumeEncryption) {
        this.enableVolumeEncryption = enableVolumeEncryption;
    }

    @JsonProperty("enableIPV6")
    public Boolean getEnableIPV6() {
        return enableIPV6;
    }

    @JsonProperty("enableIPV6")
    public void setEnableIPV6(Boolean enableIPV6) {
        this.enableIPV6 = enableIPV6;
    }

    @JsonProperty("enableExposingService")
    public String getEnableExposingService() {
        return enableExposingService;
    }

    @JsonProperty("enableExposingService")
    public void setEnableExposingService(String enableExposingService) {
        this.enableExposingService = enableExposingService;
    }

    @JsonProperty("awsArnString")
    public String getAwsArnString() {
        return awsArnString;
    }

    @JsonProperty("awsArnString")
    public void setAwsArnString(String awsArnString) {
        this.awsArnString = awsArnString;
    }

    @JsonProperty("useHostname")
    public Boolean getUseHostname() {
        return useHostname;
    }

    @JsonProperty("useHostname")
    public void setUseHostname(Boolean useHostname) {
        this.useHostname = useHostname;
    }

    @JsonProperty("masterGFlags")
    public List<Object> getMasterGFlags() {
        return masterGFlags;
    }

    @JsonProperty("masterGFlags")
    public void setMasterGFlags(List<Object> masterGFlags) {
        this.masterGFlags = masterGFlags;
    }

    @JsonProperty("tserverGFlags")
    public List<Object> getTserverGFlags() {
        return tserverGFlags;
    }

    @JsonProperty("tserverGFlags")
    public void setTserverGFlags(List<Object> tserverGFlags) {
        this.tserverGFlags = tserverGFlags;
    }

    @JsonProperty("ybcFlags")
    public YbcFlags getYbcFlags() {
        return ybcFlags;
    }

    @JsonProperty("ybcFlags")
    public void setYbcFlags(YbcFlags ybcFlags) {
        this.ybcFlags = ybcFlags;
    }

    @JsonProperty("instanceTags")
    public InstanceTags getInstanceTags() {
        return instanceTags;
    }

    @JsonProperty("instanceTags")
    public void setInstanceTags(InstanceTags instanceTags) {
        this.instanceTags = instanceTags;
    }

    @JsonProperty("dedicatedNodes")
    public Boolean getDedicatedNodes() {
        return dedicatedNodes;
    }

    @JsonProperty("dedicatedNodes")
    public void setDedicatedNodes(Boolean dedicatedNodes) {
        this.dedicatedNodes = dedicatedNodes;
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
        sb.append(UserIntent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("universeName");
        sb.append('=');
        sb.append(((this.universeName == null)?"<null>":this.universeName));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("providerType");
        sb.append('=');
        sb.append(((this.providerType == null)?"<null>":this.providerType));
        sb.append(',');
        sb.append("replicationFactor");
        sb.append('=');
        sb.append(((this.replicationFactor == null)?"<null>":this.replicationFactor));
        sb.append(',');
        sb.append("regionList");
        sb.append('=');
        sb.append(((this.regionList == null)?"<null>":this.regionList));
        sb.append(',');
        sb.append("instanceType");
        sb.append('=');
        sb.append(((this.instanceType == null)?"<null>":this.instanceType));
        sb.append(',');
        sb.append("numNodes");
        sb.append('=');
        sb.append(((this.numNodes == null)?"<null>":this.numNodes));
        sb.append(',');
        sb.append("ybSoftwareVersion");
        sb.append('=');
        sb.append(((this.ybSoftwareVersion == null)?"<null>":this.ybSoftwareVersion));
        sb.append(',');
        sb.append("accessKeyCode");
        sb.append('=');
        sb.append(((this.accessKeyCode == null)?"<null>":this.accessKeyCode));
        sb.append(',');
        sb.append("deviceInfo");
        sb.append('=');
        sb.append(((this.deviceInfo == null)?"<null>":this.deviceInfo));
        sb.append(',');
        sb.append("assignPublicIP");
        sb.append('=');
        sb.append(((this.assignPublicIP == null)?"<null>":this.assignPublicIP));
        sb.append(',');
        sb.append("assignStaticPublicIP");
        sb.append('=');
        sb.append(((this.assignStaticPublicIP == null)?"<null>":this.assignStaticPublicIP));
        sb.append(',');
        sb.append("useTimeSync");
        sb.append('=');
        sb.append(((this.useTimeSync == null)?"<null>":this.useTimeSync));
        sb.append(',');
        sb.append("enableYCQL");
        sb.append('=');
        sb.append(((this.enableYCQL == null)?"<null>":this.enableYCQL));
        sb.append(',');
        sb.append("ysqlPassword");
        sb.append('=');
        sb.append(((this.ysqlPassword == null)?"<null>":this.ysqlPassword));
        sb.append(',');
        sb.append("enableYSQLAuth");
        sb.append('=');
        sb.append(((this.enableYSQLAuth == null)?"<null>":this.enableYSQLAuth));
        sb.append(',');
        sb.append("enableYCQLAuth");
        sb.append('=');
        sb.append(((this.enableYCQLAuth == null)?"<null>":this.enableYCQLAuth));
        sb.append(',');
        sb.append("enableYSQL");
        sb.append('=');
        sb.append(((this.enableYSQL == null)?"<null>":this.enableYSQL));
        sb.append(',');
        sb.append("enableYEDIS");
        sb.append('=');
        sb.append(((this.enableYEDIS == null)?"<null>":this.enableYEDIS));
        sb.append(',');
        sb.append("enableNodeToNodeEncrypt");
        sb.append('=');
        sb.append(((this.enableNodeToNodeEncrypt == null)?"<null>":this.enableNodeToNodeEncrypt));
        sb.append(',');
        sb.append("enableClientToNodeEncrypt");
        sb.append('=');
        sb.append(((this.enableClientToNodeEncrypt == null)?"<null>":this.enableClientToNodeEncrypt));
        sb.append(',');
        sb.append("enableVolumeEncryption");
        sb.append('=');
        sb.append(((this.enableVolumeEncryption == null)?"<null>":this.enableVolumeEncryption));
        sb.append(',');
        sb.append("enableIPV6");
        sb.append('=');
        sb.append(((this.enableIPV6 == null)?"<null>":this.enableIPV6));
        sb.append(',');
        sb.append("enableExposingService");
        sb.append('=');
        sb.append(((this.enableExposingService == null)?"<null>":this.enableExposingService));
        sb.append(',');
        sb.append("awsArnString");
        sb.append('=');
        sb.append(((this.awsArnString == null)?"<null>":this.awsArnString));
        sb.append(',');
        sb.append("useHostname");
        sb.append('=');
        sb.append(((this.useHostname == null)?"<null>":this.useHostname));
        sb.append(',');
        sb.append("masterGFlags");
        sb.append('=');
        sb.append(((this.masterGFlags == null)?"<null>":this.masterGFlags));
        sb.append(',');
        sb.append("tserverGFlags");
        sb.append('=');
        sb.append(((this.tserverGFlags == null)?"<null>":this.tserverGFlags));
        sb.append(',');
        sb.append("ybcFlags");
        sb.append('=');
        sb.append(((this.ybcFlags == null)?"<null>":this.ybcFlags));
        sb.append(',');
        sb.append("instanceTags");
        sb.append('=');
        sb.append(((this.instanceTags == null)?"<null>":this.instanceTags));
        sb.append(',');
        sb.append("dedicatedNodes");
        sb.append('=');
        sb.append(((this.dedicatedNodes == null)?"<null>":this.dedicatedNodes));
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
        result = ((result* 31)+((this.replicationFactor == null)? 0 :this.replicationFactor.hashCode()));
        result = ((result* 31)+((this.enableNodeToNodeEncrypt == null)? 0 :this.enableNodeToNodeEncrypt.hashCode()));
        result = ((result* 31)+((this.enableYCQLAuth == null)? 0 :this.enableYCQLAuth.hashCode()));
        result = ((result* 31)+((this.instanceTags == null)? 0 :this.instanceTags.hashCode()));
        result = ((result* 31)+((this.providerType == null)? 0 :this.providerType.hashCode()));
        result = ((result* 31)+((this.tserverGFlags == null)? 0 :this.tserverGFlags.hashCode()));
        result = ((result* 31)+((this.ysqlPassword == null)? 0 :this.ysqlPassword.hashCode()));
        result = ((result* 31)+((this.enableYEDIS == null)? 0 :this.enableYEDIS.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.enableVolumeEncryption == null)? 0 :this.enableVolumeEncryption.hashCode()));
        result = ((result* 31)+((this.accessKeyCode == null)? 0 :this.accessKeyCode.hashCode()));
        result = ((result* 31)+((this.enableYSQLAuth == null)? 0 :this.enableYSQLAuth.hashCode()));
        result = ((result* 31)+((this.enableIPV6 == null)? 0 :this.enableIPV6 .hashCode()));
        result = ((result* 31)+((this.universeName == null)? 0 :this.universeName.hashCode()));
        result = ((result* 31)+((this.dedicatedNodes == null)? 0 :this.dedicatedNodes.hashCode()));
        result = ((result* 31)+((this.ybcFlags == null)? 0 :this.ybcFlags.hashCode()));
        result = ((result* 31)+((this.assignStaticPublicIP == null)? 0 :this.assignStaticPublicIP.hashCode()));
        result = ((result* 31)+((this.enableYSQL == null)? 0 :this.enableYSQL.hashCode()));
        result = ((result* 31)+((this.useTimeSync == null)? 0 :this.useTimeSync.hashCode()));
        result = ((result* 31)+((this.regionList == null)? 0 :this.regionList.hashCode()));
        result = ((result* 31)+((this.useHostname == null)? 0 :this.useHostname.hashCode()));
        result = ((result* 31)+((this.instanceType == null)? 0 :this.instanceType.hashCode()));
        result = ((result* 31)+((this.ybSoftwareVersion == null)? 0 :this.ybSoftwareVersion.hashCode()));
        result = ((result* 31)+((this.deviceInfo == null)? 0 :this.deviceInfo.hashCode()));
        result = ((result* 31)+((this.numNodes == null)? 0 :this.numNodes.hashCode()));
        result = ((result* 31)+((this.enableYCQL == null)? 0 :this.enableYCQL.hashCode()));
        result = ((result* 31)+((this.assignPublicIP == null)? 0 :this.assignPublicIP.hashCode()));
        result = ((result* 31)+((this.enableClientToNodeEncrypt == null)? 0 :this.enableClientToNodeEncrypt.hashCode()));
        result = ((result* 31)+((this.awsArnString == null)? 0 :this.awsArnString.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.enableExposingService == null)? 0 :this.enableExposingService.hashCode()));
        result = ((result* 31)+((this.masterGFlags == null)? 0 :this.masterGFlags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserIntent) == false) {
            return false;
        }
        UserIntent rhs = ((UserIntent) other);
        return (((((((((((((((((((((((((((((((((this.replicationFactor == rhs.replicationFactor)||((this.replicationFactor!= null)&&this.replicationFactor.equals(rhs.replicationFactor)))&&((this.enableNodeToNodeEncrypt == rhs.enableNodeToNodeEncrypt)||((this.enableNodeToNodeEncrypt!= null)&&this.enableNodeToNodeEncrypt.equals(rhs.enableNodeToNodeEncrypt))))&&((this.enableYCQLAuth == rhs.enableYCQLAuth)||((this.enableYCQLAuth!= null)&&this.enableYCQLAuth.equals(rhs.enableYCQLAuth))))&&((this.instanceTags == rhs.instanceTags)||((this.instanceTags!= null)&&this.instanceTags.equals(rhs.instanceTags))))&&((this.providerType == rhs.providerType)||((this.providerType!= null)&&this.providerType.equals(rhs.providerType))))&&((this.tserverGFlags == rhs.tserverGFlags)||((this.tserverGFlags!= null)&&this.tserverGFlags.equals(rhs.tserverGFlags))))&&((this.ysqlPassword == rhs.ysqlPassword)||((this.ysqlPassword!= null)&&this.ysqlPassword.equals(rhs.ysqlPassword))))&&((this.enableYEDIS == rhs.enableYEDIS)||((this.enableYEDIS!= null)&&this.enableYEDIS.equals(rhs.enableYEDIS))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.enableVolumeEncryption == rhs.enableVolumeEncryption)||((this.enableVolumeEncryption!= null)&&this.enableVolumeEncryption.equals(rhs.enableVolumeEncryption))))&&((this.accessKeyCode == rhs.accessKeyCode)||((this.accessKeyCode!= null)&&this.accessKeyCode.equals(rhs.accessKeyCode))))&&((this.enableYSQLAuth == rhs.enableYSQLAuth)||((this.enableYSQLAuth!= null)&&this.enableYSQLAuth.equals(rhs.enableYSQLAuth))))&&((this.enableIPV6 == rhs.enableIPV6)||((this.enableIPV6 != null)&&this.enableIPV6 .equals(rhs.enableIPV6))))&&((this.universeName == rhs.universeName)||((this.universeName!= null)&&this.universeName.equals(rhs.universeName))))&&((this.dedicatedNodes == rhs.dedicatedNodes)||((this.dedicatedNodes!= null)&&this.dedicatedNodes.equals(rhs.dedicatedNodes))))&&((this.ybcFlags == rhs.ybcFlags)||((this.ybcFlags!= null)&&this.ybcFlags.equals(rhs.ybcFlags))))&&((this.assignStaticPublicIP == rhs.assignStaticPublicIP)||((this.assignStaticPublicIP!= null)&&this.assignStaticPublicIP.equals(rhs.assignStaticPublicIP))))&&((this.enableYSQL == rhs.enableYSQL)||((this.enableYSQL!= null)&&this.enableYSQL.equals(rhs.enableYSQL))))&&((this.useTimeSync == rhs.useTimeSync)||((this.useTimeSync!= null)&&this.useTimeSync.equals(rhs.useTimeSync))))&&((this.regionList == rhs.regionList)||((this.regionList!= null)&&this.regionList.equals(rhs.regionList))))&&((this.useHostname == rhs.useHostname)||((this.useHostname!= null)&&this.useHostname.equals(rhs.useHostname))))&&((this.instanceType == rhs.instanceType)||((this.instanceType!= null)&&this.instanceType.equals(rhs.instanceType))))&&((this.ybSoftwareVersion == rhs.ybSoftwareVersion)||((this.ybSoftwareVersion!= null)&&this.ybSoftwareVersion.equals(rhs.ybSoftwareVersion))))&&((this.deviceInfo == rhs.deviceInfo)||((this.deviceInfo!= null)&&this.deviceInfo.equals(rhs.deviceInfo))))&&((this.numNodes == rhs.numNodes)||((this.numNodes!= null)&&this.numNodes.equals(rhs.numNodes))))&&((this.enableYCQL == rhs.enableYCQL)||((this.enableYCQL!= null)&&this.enableYCQL.equals(rhs.enableYCQL))))&&((this.assignPublicIP == rhs.assignPublicIP)||((this.assignPublicIP!= null)&&this.assignPublicIP.equals(rhs.assignPublicIP))))&&((this.enableClientToNodeEncrypt == rhs.enableClientToNodeEncrypt)||((this.enableClientToNodeEncrypt!= null)&&this.enableClientToNodeEncrypt.equals(rhs.enableClientToNodeEncrypt))))&&((this.awsArnString == rhs.awsArnString)||((this.awsArnString!= null)&&this.awsArnString.equals(rhs.awsArnString))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.enableExposingService == rhs.enableExposingService)||((this.enableExposingService!= null)&&this.enableExposingService.equals(rhs.enableExposingService))))&&((this.masterGFlags == rhs.masterGFlags)||((this.masterGFlags!= null)&&this.masterGFlags.equals(rhs.masterGFlags))));
    }

}
