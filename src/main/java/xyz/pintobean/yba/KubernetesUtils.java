package xyz.pintobean.yba;

import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.ConfigMapBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.fabric8.kubernetes.client.dsl.Resource;

/** 
 * Utilities for creating and reading Kubernetes resources
 */
public class KubernetesUtils {
    
    private static KubernetesClient kubernetesClient = new KubernetesClientBuilder().build();

    public static void writeToConfigMap(String configMapName, String namespace, String key, String value) {

       Resource<ConfigMap> configMapResource = kubernetesClient
            .configMaps()
            .inNamespace(namespace)
            .withName(configMapName);
        
        if (configMapResource.get() == null) {
            ConfigMap configMap = new ConfigMapBuilder()
                .withNewMetadata()
                .withName(configMapName)
                .withNamespace(namespace)
                .endMetadata()
                .addToData(key, value)
                .build();

            kubernetesClient
                .configMaps()
                .inNamespace(namespace)
                .resource(configMap)
                .create();
        } else {
            configMapResource.edit(
                c -> new ConfigMapBuilder(c).addToData(key, value).build()
            );
        }
    }

    public static String readFromConfigMap(String configMapName, String namespace, String key) {

        return kubernetesClient
            .configMaps()
            .inNamespace(namespace)
            .withName(configMapName)
            .get()
            .getData()
            .get(key);
    }
}
