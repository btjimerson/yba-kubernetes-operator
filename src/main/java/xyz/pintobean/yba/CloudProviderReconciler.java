package xyz.pintobean.yba;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import xyz.pintobean.yba.action.CreateProviderAction;
import xyz.pintobean.yba.domain.CloudProviderKubernetesEntity;
import xyz.pintobean.yba.domain.YbaProperties;

@ControllerConfiguration
public class CloudProviderReconciler implements Reconciler<CloudProvider> {

    private final Log LOG = LogFactory.getLog(this.getClass());
    
    YbaProperties ybaArguments;
    
    public void setYbaArguments(YbaProperties ybaArguments) {
        this.ybaArguments = ybaArguments;
    }

    @Override
    public UpdateControl<CloudProvider> reconcile(CloudProvider resource, Context<CloudProvider> context)
            throws Exception {

        String customerUuid = KubernetesUtils.readFromConfigMap(
            "yba-operator-config-map",
            resource.getMetadata().getNamespace(),
            "customerUuid"
        );

        String apiToken = KubernetesUtils.readFromConfigMap(
            "yba-operator-config-map",
            resource.getMetadata().getNamespace(),
            "apiToken"
        );

        CloudProviderKubernetesEntity cloudProvider = new CloudProviderKubernetesEntity();
        cloudProvider.setKubeconfig(resource.getSpec().getKubeconfig());
        cloudProvider.setCustomerUuid(customerUuid);
        cloudProvider.setName(resource.getSpec().getName());
        cloudProvider.setRegion(resource.getSpec().getRegion());
        cloudProvider.setRegionLatitude(resource.getSpec().getRegionLatitude());
        cloudProvider.setRegionLongitude(resource.getSpec().getRegionLongitude());
        cloudProvider.setZone(resource.getSpec().getZone());

        CreateProviderAction createProviderAction = new CreateProviderAction();
        createProviderAction.setYbaArguments(ybaArguments);
        createProviderAction.setApiToken(apiToken);
        Map<String, String> results = createProviderAction.runAction(cloudProvider);
        LOG.info(String.format("Results from create provider action = [{%s}]", results));

        CloudProviderStatus cloudProviderStatus = new CloudProviderStatus();
        cloudProviderStatus.setStatus("success");
        resource.setStatus(cloudProviderStatus);

        KubernetesUtils.writeToConfigMap(
            "yba-operator-config-map",
            resource.getMetadata().getNamespace(),
            "providerUuid",
            results.get("providerUuid")
        );

        return UpdateControl.patchStatus(resource);

    }
   
}
