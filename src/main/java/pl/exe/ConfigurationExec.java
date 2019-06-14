package pl.exe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@ComponentScan({"pl.exe"})
public class ConfigurationExec {

    @Profile({"prod", "!dev"})
    @Bean(name = "permissionService")
    public PermissionService getPermissionService(){
        return new PermissionService();
    }

    @Profile("dev")
    @Bean(name = "permissionService")
    public PermissionService getPermissionServiceDev(){
        return new PermissionService();
    }

    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
