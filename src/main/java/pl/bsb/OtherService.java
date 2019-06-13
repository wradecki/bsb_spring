package pl.bsb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherService {
    @Autowired
    private CustomerService[] customerService;

    public OtherService(CustomerService[] customerService) {
        this.customerService = customerService;
    }

    public void doSomething(){
        for (CustomerService service : customerService) {
            System.out.println(service);
        }
    }

    public void doElse() {
        System.out.println("else");
    }
}