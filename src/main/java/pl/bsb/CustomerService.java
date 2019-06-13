package pl.bsb;

//@Component
//@Repository
//@Service()
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Lazy
//@Scope("request")
//@Scope("webapplication")
//@Controller
//@RestController
public class CustomerService {
    public CustomerService() {
        System.out.println("CustomerService ctor");
    }

    public String test(){
        return this.toString();
    }
}
