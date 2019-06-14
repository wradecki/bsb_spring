package pl.testing;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

@ContextConfiguration(classes = ConfigTesting.class)
public class TestWithOtherSpringConfig {
    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();
    @Rule
    public final SpringMethodRule SPRING_METHOD_RULE = new SpringMethodRule();

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
