package xyz.pintobean.yba;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import xyz.pintobean.yba.action.CreateUniverseAction;
import xyz.pintobean.yba.domain.UniverseKubernetesEntity;
import xyz.pintobean.yba.domain.YbaProperties;

@ControllerConfiguration
public class UniverseReconciler implements Reconciler<Universe>{

    private final Log LOG = LogFactory.getLog(this.getClass());

    YbaProperties ybaArguments;
    
    public void setYbaArguments(YbaProperties ybaArguments) {
        this.ybaArguments = ybaArguments;
    }
    
    @Override
    public UpdateControl<Universe> reconcile(Universe resource, Context<Universe> context) throws Exception {

        UniverseKubernetesEntity universe = new UniverseKubernetesEntity();
        universe.setName(resource.getSpec().getName());
        universe.setReplicationFactor(resource.getSpec().getReplicationFactor());
        universe.setSoftwareVersion(resource.getSpec().getSoftwareVersion());
        universe.setStorageClass(resource.getSpec().getStorageClass());
        universe.setVolumeSize(resource.getSpec().getVolumeSize());
        universe.setYcqlPassword(resource.getSpec().getYcqlPassword());
        universe.setYsqlPassword(resource.getSpec().getYsqlPassword());

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

        String providerUuid = KubernetesUtils.readFromConfigMap(
            "yba-operator-config-map",
            resource.getMetadata().getNamespace(),
            "providerUuid"
        );

        CreateUniverseAction createUniverseAction = new CreateUniverseAction();
        createUniverseAction.setYbaArguments(ybaArguments);
        createUniverseAction.setApiToken(apiToken);
        createUniverseAction.setCustomerUuid(customerUuid);
        createUniverseAction.setProviderUuid(providerUuid);
        Map<String, String> results = createUniverseAction.runAction(universe);
        LOG.info(String.format("Results from create universe action = [{%s}]", results));
        
        UniverseStatus universeStatus = new UniverseStatus();
        universeStatus.setStatus("success");
        resource.setStatus(universeStatus);

        KubernetesUtils.writeToConfigMap(
            "yba-operator-config-map",
            resource.getMetadata().getNamespace(),
            "universeUuid",
            results.get("universeUuid")
        );
        
        return UpdateControl.patchStatus(resource);
    }
    
}
