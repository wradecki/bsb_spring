package pl.postproce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class FirstClass {

    @Autowired
    private SecondClass secondClass;


    public FirstClass() {
        System.out.println("FirstClass constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("FirstClass init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("FirstClass destroy");
    }
}
