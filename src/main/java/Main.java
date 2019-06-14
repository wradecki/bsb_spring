import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
import pl.exe.ConfigurationExec;
import pl.exe.UserService;

/**
 * Created by Wojciech Oczkowski on 2019-06-13.
 */
public class Main {
    public static void main(String[] args) {
        GenericApplicationContext applicationContext = new GenericApplicationContext();
//        applicationContext.getEnvironment().setActiveProfiles("dev");
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(applicationContext);
        xmlBeanDefinitionReader.loadBeanDefinitions("/beans.xml");
        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(applicationContext);
        annotatedBeanDefinitionReader.registerBean(ConfigurationExec.class);
        applicationContext.registerShutdownHook();
        applicationContext.refresh();

        UserService bean = applicationContext.getBean(UserService.class);

    }
}
