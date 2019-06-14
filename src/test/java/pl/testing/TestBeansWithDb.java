package pl.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.exe.ConfigurationExec;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/beans.xml", classes = ConfigurationExec.class)
public class TestBeansWithDb {
    @Test
    public void first() {

    }
}
