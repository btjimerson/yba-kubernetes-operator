
package xyz.pintobean.yba.domain.software;

import java.util.LinkedHashMap;
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
    "name",
    "replicationFactor",
    "numNodesInAZ",
    "isAffinitized"
})
@Generated("jsonschema2pojo")
public class Az {

    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("replicationFactor")
    private Integer replicationFactor;
    @JsonProperty("numNodesInAZ")
    private Integer numNodesInAZ;
    @JsonProperty("isAffinitized")
    private Boolean isAffinitized;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Az() {
    }

    /**
     * 
     * @param replicationFactor
     * @param numNodesInAZ
     * @param name
     * @param isAffinitized
     * @param uuid
     */
    public Az(String uuid, String name, Integer replicationFactor, Integer numNodesInAZ, Boolean isAffinitized) {
        super();
        this.uuid = uuid;
        this.name = name;
        this.replicationFactor = replicationFactor;
        this.numNodesInAZ = numNodesInAZ;
        this.isAffinitized = isAffinitized;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("replicationFactor")
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    @JsonProperty("replicationFactor")
    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    @JsonProperty("numNodesInAZ")
    public Integer getNumNodesInAZ() {
        return numNodesInAZ;
    }

    @JsonProperty("numNodesInAZ")
    public void setNumNodesInAZ(Integer numNodesInAZ) {
        this.numNodesInAZ = numNodesInAZ;
    }

    @JsonProperty("isAffinitized")
    public Boolean getIsAffinitized() {
        return isAffinitized;
    }

    @JsonProperty("isAffinitized")
    public void setIsAffinitized(Boolean isAffinitized) {
        this.isAffinitized = isAffinitized;
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
        sb.append(Az.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("replicationFactor");
        sb.append('=');
        sb.append(((this.replicationFactor == null)?"<null>":this.replicationFactor));
        sb.append(',');
        sb.append("numNodesInAZ");
        sb.append('=');
        sb.append(((this.numNodesInAZ == null)?"<null>":this.numNodesInAZ));
        sb.append(',');
        sb.append("isAffinitized");
        sb.append('=');
        sb.append(((this.isAffinitized == null)?"<null>":this.isAffinitized));
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
        result = ((result* 31)+((this.numNodesInAZ == null)? 0 :this.numNodesInAZ.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.isAffinitized == null)? 0 :this.isAffinitized.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Az) == false) {
            return false;
        }
        Az rhs = ((Az) other);
        return (((((((this.replicationFactor == rhs.replicationFactor)||((this.replicationFactor!= null)&&this.replicationFactor.equals(rhs.replicationFactor)))&&((this.numNodesInAZ == rhs.numNodesInAZ)||((this.numNodesInAZ!= null)&&this.numNodesInAZ.equals(rhs.numNodesInAZ))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.isAffinitized == rhs.isAffinitized)||((this.isAffinitized!= null)&&this.isAffinitized.equals(rhs.isAffinitized))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))));
    }

}
