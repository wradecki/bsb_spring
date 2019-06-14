import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import pl.exe.ConfigurationExec;
import pl.exe.UserService;
import pl.postproce.FirstClass;

/**
 * Created by Wojciech Oczkowski on 2019-06-13.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("pl.postproce");
        applicationContext.refresh();
        applicationContext.registerShutdownHook();

        FirstClass bean = applicationContext.getBean(FirstClass.class);
        bean.sendtest();

    }
}
