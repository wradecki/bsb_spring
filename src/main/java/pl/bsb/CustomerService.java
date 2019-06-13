package pl.bsb;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Repository
@Service()
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Lazy
//@Scope("request")
//@Scope("webapplication")
//@Controller
//@RestController
public class CustomerService {
    public CustomerService() {
        System.out.println("CustomerService ctor");
    }
}
