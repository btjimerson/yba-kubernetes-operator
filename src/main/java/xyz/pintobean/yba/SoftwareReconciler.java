package xyz.pintobean.yba;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import xyz.pintobean.yba.action.UpgradeUniverseAction;
import xyz.pintobean.yba.domain.SoftwareKubernetesEntity;
import xyz.pintobean.yba.domain.YbaProperties;

@ControllerConfiguration
public class SoftwareReconciler implements Reconciler<Software>{

    private final Log LOG = LogFactory.getLog(this.getClass());

    YbaProperties ybaArguments;
    
    public void setYbaArguments(YbaProperties ybaArguments) {
        this.ybaArguments = ybaArguments;
    }
    
    @Override
    public UpdateControl<Software> reconcile(Software resource, Context<Software> context) throws Exception {

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

        String universeUuid = KubernetesUtils.readFromConfigMap(
            "yba-operator-config-map",
            resource.getMetadata().getNamespace(),
            "universeUuid"
        );

        SoftwareKubernetesEntity software = new SoftwareKubernetesEntity();
        software.setChartVersion(resource.getSpec().getChartVersion());
        software.setCustomerUuid(customerUuid);
        software.setName(resource.getSpec().getName());
        software.setSoftwareVersion(resource.getSpec().getName());
        software.setTaskType(resource.getSpec().getTaskType());
        software.setUniverseUuid(universeUuid);
        software.setUpgradeOption(resource.getSpec().getUpgradeOption());

        UpgradeUniverseAction upgradeUniverseAction = new UpgradeUniverseAction();
        upgradeUniverseAction.setApiToken(apiToken);
        upgradeUniverseAction.setYbaArguments(ybaArguments);
        Map<String, String> results = upgradeUniverseAction.runAction(software);
        LOG.info(String.format("Results from upgrade universe action = [{%s}]", results));
        
        SoftwareStatus softwareStatus = new SoftwareStatus();
        softwareStatus.setStatus("success");
        resource.setStatus(softwareStatus);

        return UpdateControl.patchStatus(resource);
    }
    
}
