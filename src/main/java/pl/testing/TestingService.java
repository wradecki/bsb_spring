package pl.testing;

import org.springframework.stereotype.Service;

@Service
public class TestingService {
    public String getTestValue(){
        return "test value";
    }
}
