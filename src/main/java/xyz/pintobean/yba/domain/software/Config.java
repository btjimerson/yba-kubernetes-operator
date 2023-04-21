
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
    "KUBE_POD_ADDRESS_TEMPLATE",
    "OVERRIDES",
    "STORAGE_CLASS",
    "KUBECONFIG",
    "KUBENAMESPACE"
})
@Generated("jsonschema2pojo")
public class Config {

    @JsonProperty("KUBE_POD_ADDRESS_TEMPLATE")
    private String kubePodAddressTemplate;
    @JsonProperty("OVERRIDES")
    private String overrides;
    @JsonProperty("STORAGE_CLASS")
    private String storageClass;
    @JsonProperty("KUBECONFIG")
    private String kubeconfig;
    @JsonProperty("KUBENAMESPACE")
    private String kubenamespace;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Config() {
    }

    /**
     * 
     * @param storageClass
     * @param kubenamespace
     * @param kubePodAddressTemplate
     * @param overrides
     * @param kubeconfig
     */
    public Config(String kubePodAddressTemplate, String overrides, String storageClass, String kubeconfig, String kubenamespace) {
        super();
        this.kubePodAddressTemplate = kubePodAddressTemplate;
        this.overrides = overrides;
        this.storageClass = storageClass;
        this.kubeconfig = kubeconfig;
        this.kubenamespace = kubenamespace;
    }

    @JsonProperty("KUBE_POD_ADDRESS_TEMPLATE")
    public String getKubePodAddressTemplate() {
        return kubePodAddressTemplate;
    }

    @JsonProperty("KUBE_POD_ADDRESS_TEMPLATE")
    public void setKubePodAddressTemplate(String kubePodAddressTemplate) {
        this.kubePodAddressTemplate = kubePodAddressTemplate;
    }

    @JsonProperty("OVERRIDES")
    public String getOverrides() {
        return overrides;
    }

    @JsonProperty("OVERRIDES")
    public void setOverrides(String overrides) {
        this.overrides = overrides;
    }

    @JsonProperty("STORAGE_CLASS")
    public String getStorageClass() {
        return storageClass;
    }

    @JsonProperty("STORAGE_CLASS")
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    @JsonProperty("KUBECONFIG")
    public String getKubeconfig() {
        return kubeconfig;
    }

    @JsonProperty("KUBECONFIG")
    public void setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
    }

    @JsonProperty("KUBENAMESPACE")
    public String getKubenamespace() {
        return kubenamespace;
    }

    @JsonProperty("KUBENAMESPACE")
    public void setKubenamespace(String kubenamespace) {
        this.kubenamespace = kubenamespace;
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
        sb.append(Config.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kubePodAddressTemplate");
        sb.append('=');
        sb.append(((this.kubePodAddressTemplate == null)?"<null>":this.kubePodAddressTemplate));
        sb.append(',');
        sb.append("overrides");
        sb.append('=');
        sb.append(((this.overrides == null)?"<null>":this.overrides));
        sb.append(',');
        sb.append("storageClass");
        sb.append('=');
        sb.append(((this.storageClass == null)?"<null>":this.storageClass));
        sb.append(',');
        sb.append("kubeconfig");
        sb.append('=');
        sb.append(((this.kubeconfig == null)?"<null>":this.kubeconfig));
        sb.append(',');
        sb.append("kubenamespace");
        sb.append('=');
        sb.append(((this.kubenamespace == null)?"<null>":this.kubenamespace));
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
        result = ((result* 31)+((this.kubenamespace == null)? 0 :this.kubenamespace.hashCode()));
        result = ((result* 31)+((this.kubePodAddressTemplate == null)? 0 :this.kubePodAddressTemplate.hashCode()));
        result = ((result* 31)+((this.overrides == null)? 0 :this.overrides.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.kubeconfig == null)? 0 :this.kubeconfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Config) == false) {
            return false;
        }
        Config rhs = ((Config) other);
        return (((((((this.storageClass == rhs.storageClass)||((this.storageClass!= null)&&this.storageClass.equals(rhs.storageClass)))&&((this.kubenamespace == rhs.kubenamespace)||((this.kubenamespace!= null)&&this.kubenamespace.equals(rhs.kubenamespace))))&&((this.kubePodAddressTemplate == rhs.kubePodAddressTemplate)||((this.kubePodAddressTemplate!= null)&&this.kubePodAddressTemplate.equals(rhs.kubePodAddressTemplate))))&&((this.overrides == rhs.overrides)||((this.overrides!= null)&&this.overrides.equals(rhs.overrides))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.kubeconfig == rhs.kubeconfig)||((this.kubeconfig!= null)&&this.kubeconfig.equals(rhs.kubeconfig))));
    }

}
