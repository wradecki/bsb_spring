package pl.testing;

import org.springframework.stereotype.Service;

@Service
public class TestingService {
    public TestingService() {
        System.out.println("TestingService");
    }

    public String getTestValue(){
        return "test value";
    }
}
