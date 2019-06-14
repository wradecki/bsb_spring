package pl.testing;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;

@ContextConfiguration(classes = ConfigTesting.class)
public class TestWithOtherSpringConfig {
    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

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
