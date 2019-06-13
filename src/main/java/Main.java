import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import pl.bsb.CustomerService;

/**
 * Created by Wojciech Oczkowski on 2019-06-13.
 */
public class Main {
    public static void main(String[] args) {
        GenericApplicationContext applicationContext = new GenericApplicationContext();
        new AnnotatedBeanDefinitionReader(applicationContext).register(CustomerService.class);
        applicationContext.refresh();

        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        System.out.println("customerService: " + customerService);
    }
}
