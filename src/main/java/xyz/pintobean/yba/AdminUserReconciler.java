package xyz.pintobean.yba;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import xyz.pintobean.yba.action.RegisterAdminUserAction;
import xyz.pintobean.yba.domain.AdminUserKubernetesEntity;
import xyz.pintobean.yba.domain.YbaProperties;

@ControllerConfiguration
public class AdminUserReconciler implements Reconciler<AdminUser> {

    YbaProperties ybaArguments;
    
    public void setYbaArguments(YbaProperties ybaArguments) {
        this.ybaArguments = ybaArguments;
    }

    private final Log LOG = LogFactory.getLog(this.getClass());

    @Override
    public UpdateControl<AdminUser> reconcile(AdminUser resource, Context<AdminUser> context) throws Exception {

        AdminUserKubernetesEntity adminUser = new AdminUserKubernetesEntity();
        adminUser.setFullName(resource.getSpec().getFullName());
        adminUser.setPassword(resource.getSpec().getPassword());
        adminUser.setEmail(resource.getSpec().getEmail());
        adminUser.setEnvironment(resource.getSpec().getEnvironment());

        RegisterAdminUserAction registerAdminUserAction = new RegisterAdminUserAction();
        registerAdminUserAction.setYbaArguments(ybaArguments);
        Map<String, String> results = registerAdminUserAction.runAction(adminUser);
        LOG.info(String.format("Results from register admin user action = [{%s}]", results));

        AdminUserStatus adminUserStatus = new AdminUserStatus();
        adminUserStatus.setStatus("success");
        resource.setStatus(adminUserStatus);

        KubernetesUtils.writeToConfigMap(
            "yba-operator-config-map",
            resource.getMetadata().getNamespace(), 
            "apiToken", 
            results.get("apiToken")
        );

        KubernetesUtils.writeToConfigMap(
            "yba-operator-config-map",
            resource.getMetadata().getNamespace(), 
            "customerUuid", 
            results.get("customerUuid")
        );

        KubernetesUtils.writeToConfigMap(
            "yba-operator-config-map",
            resource.getMetadata().getNamespace(), 
            "userUuid", 
            results.get("userUuid")
        );

        return UpdateControl.patchStatus(resource);
    }
    
}
