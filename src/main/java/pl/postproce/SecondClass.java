package pl.postproce;

import org.springframework.context.event.*;
import org.springframework.scheduling.annotation.Async;
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

    @EventListener({ContextClosedEvent.class, ContextStartedEvent.class, ContextStoppedEvent.class})
    public void incomingEvent(ApplicationContextEvent event){
        System.out.println("incomingEvent" + event);
    }

    @EventListener({MySpringEvent.class})
    @Async
    public void myEventListener(){
        System.out.println("myEventListener");
    }
}
