package pl.exe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan({"pl.exe"})
public class ConfigurationExec {

    @Profile("prod")
    @Bean(name = "permissionService")
    public PermissionService getPermissionService(){
        return new PermissionService();
    }

    @Profile("dev")
    @Bean(name = "permissionService")
    public PermissionService getPermissionServiceDev(){
        return null;
    }
}
