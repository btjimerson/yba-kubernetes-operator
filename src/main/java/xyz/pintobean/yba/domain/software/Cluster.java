
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
    "uuid",
    "clusterType",
    "userIntent",
    "placementInfo",
    "index",
    "regions"
})
@Generated("jsonschema2pojo")
public class Cluster {

    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("clusterType")
    private String clusterType;
    @JsonProperty("userIntent")
    private UserIntent userIntent;
    @JsonProperty("placementInfo")
    private PlacementInfo placementInfo;
    @JsonProperty("index")
    private Integer index;
    @JsonProperty("regions")
    private List<Region__1> regions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cluster() {
    }

    /**
     * 
     * @param clusterType
     * @param placementInfo
     * @param regions
     * @param userIntent
     * @param index
     * @param uuid
     */
    public Cluster(String uuid, String clusterType, UserIntent userIntent, PlacementInfo placementInfo, Integer index, List<Region__1> regions) {
        super();
        this.uuid = uuid;
        this.clusterType = clusterType;
        this.userIntent = userIntent;
        this.placementInfo = placementInfo;
        this.index = index;
        this.regions = regions;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("clusterType")
    public String getClusterType() {
        return clusterType;
    }

    @JsonProperty("clusterType")
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    @JsonProperty("userIntent")
    public UserIntent getUserIntent() {
        return userIntent;
    }

    @JsonProperty("userIntent")
    public void setUserIntent(UserIntent userIntent) {
        this.userIntent = userIntent;
    }

    @JsonProperty("placementInfo")
    public PlacementInfo getPlacementInfo() {
        return placementInfo;
    }

    @JsonProperty("placementInfo")
    public void setPlacementInfo(PlacementInfo placementInfo) {
        this.placementInfo = placementInfo;
    }

    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    @JsonProperty("regions")
    public List<Region__1> getRegions() {
        return regions;
    }

    @JsonProperty("regions")
    public void setRegions(List<Region__1> regions) {
        this.regions = regions;
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
        sb.append(Cluster.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("clusterType");
        sb.append('=');
        sb.append(((this.clusterType == null)?"<null>":this.clusterType));
        sb.append(',');
        sb.append("userIntent");
        sb.append('=');
        sb.append(((this.userIntent == null)?"<null>":this.userIntent));
        sb.append(',');
        sb.append("placementInfo");
        sb.append('=');
        sb.append(((this.placementInfo == null)?"<null>":this.placementInfo));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("regions");
        sb.append('=');
        sb.append(((this.regions == null)?"<null>":this.regions));
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
        result = ((result* 31)+((this.clusterType == null)? 0 :this.clusterType.hashCode()));
        result = ((result* 31)+((this.placementInfo == null)? 0 :this.placementInfo.hashCode()));
        result = ((result* 31)+((this.regions == null)? 0 :this.regions.hashCode()));
        result = ((result* 31)+((this.userIntent == null)? 0 :this.userIntent.hashCode()));
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cluster) == false) {
            return false;
        }
        Cluster rhs = ((Cluster) other);
        return ((((((((this.clusterType == rhs.clusterType)||((this.clusterType!= null)&&this.clusterType.equals(rhs.clusterType)))&&((this.placementInfo == rhs.placementInfo)||((this.placementInfo!= null)&&this.placementInfo.equals(rhs.placementInfo))))&&((this.regions == rhs.regions)||((this.regions!= null)&&this.regions.equals(rhs.regions))))&&((this.userIntent == rhs.userIntent)||((this.userIntent!= null)&&this.userIntent.equals(rhs.userIntent))))&&((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))));
    }

}
