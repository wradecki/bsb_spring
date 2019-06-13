package pl.bsb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "custService")
    public CustomerService getCustomerService(){
        return new CustomerService();
    }

    @Bean("othersService2")
    public OtherService getOthersService() {
        return new OtherService(getCustomerService());
    }
}
