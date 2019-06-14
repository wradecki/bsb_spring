package pl.testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.exe.ConfigurationExec;
import pl.exe.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConfigTesting.class, ConfigurationExec.class})
public class TestingExe {
    @Autowired
    UserService userService;

    @Test
    public void configurationTest() {

    }

    @Test
    public void firstTest() {
        Assert.assertEquals("UserService RoleService PermissionService", userService.testMethod());
    }

    // Clear test Change variable
    @Test
    public void Clear_test__Change_variable() {
        userService.changeTestVariable("test");

        Assert.assertEquals("test", userService.getClearTestVariable());
    }

    // Clear test After clear
    @Test
    public void Clear_test__After_clear() {
        Assert.assertEquals("clearTestVariable", userService.getClearTestVariable());
    }

}
