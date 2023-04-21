
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
    "volumeSize",
    "numVolumes",
    "storageClass"
})
@Generated("jsonschema2pojo")
public class DeviceInfo {

    @JsonProperty("volumeSize")
    private Integer volumeSize;
    @JsonProperty("numVolumes")
    private Integer numVolumes;
    @JsonProperty("storageClass")
    private String storageClass;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeviceInfo() {
    }

    /**
     * 
     * @param storageClass
     * @param numVolumes
     * @param volumeSize
     */
    public DeviceInfo(Integer volumeSize, Integer numVolumes, String storageClass) {
        super();
        this.volumeSize = volumeSize;
        this.numVolumes = numVolumes;
        this.storageClass = storageClass;
    }

    @JsonProperty("volumeSize")
    public Integer getVolumeSize() {
        return volumeSize;
    }

    @JsonProperty("volumeSize")
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    @JsonProperty("numVolumes")
    public Integer getNumVolumes() {
        return numVolumes;
    }

    @JsonProperty("numVolumes")
    public void setNumVolumes(Integer numVolumes) {
        this.numVolumes = numVolumes;
    }

    @JsonProperty("storageClass")
    public String getStorageClass() {
        return storageClass;
    }

    @JsonProperty("storageClass")
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
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
        sb.append(DeviceInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("volumeSize");
        sb.append('=');
        sb.append(((this.volumeSize == null)?"<null>":this.volumeSize));
        sb.append(',');
        sb.append("numVolumes");
        sb.append('=');
        sb.append(((this.numVolumes == null)?"<null>":this.numVolumes));
        sb.append(',');
        sb.append("storageClass");
        sb.append('=');
        sb.append(((this.storageClass == null)?"<null>":this.storageClass));
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
        result = ((result* 31)+((this.storageClass == null)? 0 :this.storageClass.hashCode()));
        result = ((result* 31)+((this.numVolumes == null)? 0 :this.numVolumes.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.volumeSize == null)? 0 :this.volumeSize.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceInfo) == false) {
            return false;
        }
        DeviceInfo rhs = ((DeviceInfo) other);
        return (((((this.storageClass == rhs.storageClass)||((this.storageClass!= null)&&this.storageClass.equals(rhs.storageClass)))&&((this.numVolumes == rhs.numVolumes)||((this.numVolumes!= null)&&this.numVolumes.equals(rhs.numVolumes))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.volumeSize == rhs.volumeSize)||((this.volumeSize!= null)&&this.volumeSize.equals(rhs.volumeSize))));
    }

}
