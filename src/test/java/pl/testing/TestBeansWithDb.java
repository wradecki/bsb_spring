package pl.testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.exe.ConfigurationExec;
import pl.exe.User;
import pl.exe.UserService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/beans.xml")
@Sql(scripts = "/insert.sql")
public class TestBeansWithDb {
    @Autowired
    UserService userService;

    @Test
    public void first() {
        List<User> allUsers = userService.getAllUsers();
        User       user     = allUsers.get(0);
        Assert.assertEquals("FIRST", user.getFirstName());
        Assert.assertEquals("LAST", user.getLastName());
    }
}
