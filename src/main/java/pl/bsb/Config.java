package pl.bsb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Config {

    @Bean(name = "custService")
    public CustomerService getCustomerService(){
        return new CustomerService();
    }
}
