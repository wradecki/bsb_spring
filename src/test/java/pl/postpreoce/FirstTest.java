package pl.postpreoce;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.postproce.ConfigPostProcessors;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigPostProcessors.class)
public class FirstTest {

    @Test
    public void configurationTest() {

    }
}
