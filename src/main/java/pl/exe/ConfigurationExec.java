package pl.exe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"pl.exe"})
public class ConfigurationExec {

    @Bean(name = "permissionService")
    public PermissionService getPermissionService(){
        return new PermissionService();
    }
}
