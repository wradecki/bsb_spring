package pl.postproce;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class SecondClass {

    public SecondClass() {
        System.out.println("SecondClass constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("SecondClass init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("SecondClass destroy");
    }
}
