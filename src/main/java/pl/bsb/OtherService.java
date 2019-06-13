package pl.bsb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherService {
    @Autowired
    private CustomerService customerService;

    public void doSomething(){
        System.out.println(customerService);
    }

    public void doElse() {
        System.out.println("else");
    }
}