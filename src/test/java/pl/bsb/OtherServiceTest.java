package pl.bsb;

import org.junit.Test;
import org.springframework.util.ReflectionUtils;

import static org.junit.Assert.*;

public class OtherServiceTest {

    @Test
    public void doSth() {
        CustomerService cs = new CustomerService();
        OtherService otherService = new OtherService(new CustomerService[]{cs});

        otherService.doSomething();
    }
}