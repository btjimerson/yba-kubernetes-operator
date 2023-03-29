package xyz.pintobean.yba;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.javaoperatorsdk.operator.Operator;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import xyz.pintobean.yba.domain.YbaProperties;

@Configuration
public class YbaOperatorConfiguration {

    @Autowired
	private YbaProperties ybaArguments;
    
    @Bean
    public KubernetesClient defaultKubernetesClient() {
        return new KubernetesClientBuilder().build();
    }
    
    @Bean
    public AdminUserReconciler adminUserController() {
       AdminUserReconciler controller = new AdminUserReconciler();
       controller.setYbaArguments(ybaArguments);
       return controller;
    }

    @Bean 
    CloudProviderReconciler cloudProviderController() {
        CloudProviderReconciler controller = new CloudProviderReconciler();
        controller.setYbaArguments(ybaArguments);
        return controller;
    }

    @Bean
    UniverseReconciler universeController() {
        UniverseReconciler controller = new UniverseReconciler();
        controller.setYbaArguments(ybaArguments);
        return controller;
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    @SuppressWarnings("rawtypes")
    public Operator operator(List<Reconciler> controllers, KubernetesClient client) {
        Operator operator = new Operator(client);
        controllers.forEach(operator::register);
        return operator;
    }
    
}
