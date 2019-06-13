import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
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
        XmlBeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(applicationContext);
        definitionReader.loadBeanDefinitions("/beans.xml");
        applicationContext.refresh();

        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        System.out.println("customerService: " + customerService);
    }
}
