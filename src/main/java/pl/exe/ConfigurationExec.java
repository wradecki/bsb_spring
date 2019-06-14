package pl.exe;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;


import javax.sql.DataSource;
import javax.transaction.TransactionManager;

@Configuration
@ComponentScan({"pl.exe"})
@EnableJpaRepositories
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

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSource);
        return localContainerEntityManagerFactoryBean;
    }
}
