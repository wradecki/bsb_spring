import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import pl.bsb.CustomerService;
import pl.bsb.OtherService;

/**
 * Created by Wojciech Oczkowski on 2019-06-13.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("pl.bsb");
        applicationContext.refresh();
//        CustomerService customerService = applicationContext.getBean(CustomerService.class);
//        CustomerService customerService2 = applicationContext.getBean("customerService", CustomerService.class);
//
//        System.out.println("customerService: " + customerService);
//        System.out.println("customerService2: " + customerService2);

        OtherService bean = applicationContext.getBean(OtherService.class);

        System.out.println("otherService: " + bean);
        bean.doElse();
    }
}
