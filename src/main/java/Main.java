import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import pl.itkontekst.spring.CustomerService;

/**
 * Created by Wojciech Oczkowski on 2019-06-13.
 */
public class Main {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext
//                = new ClassPathXmlApplicationContext("/beans.xml");

//        GenericApplicationContext applicationContext = new GenericApplicationContext();
//        new XmlBeanDefinitionReader(applicationContext).loadBeanDefinitions("/beans.xml");
//        new AnnotatedBeanDefinitionReader(applicationContext).register();
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext();
        applicationContext.scan("pl.itkontekst");
        applicationContext.refresh();
        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        System.out.println("customerSevice: "+ customerService);


    }
}
