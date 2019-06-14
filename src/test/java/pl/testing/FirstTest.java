package pl.testing;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.postproce.ConfigPostProcessors;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigTesting.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class FirstTest {

    @Autowired
    TestingService testingService;

    @Test
    public void configurationTest() {
    }

    @Test
    public void testingService() {
        Assert.assertEquals("test value", testingService.getTestValue());
    }
}
