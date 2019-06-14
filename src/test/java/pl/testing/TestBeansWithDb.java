package pl.testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.exe.*;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/beans.xml")
@Sql(scripts = "/insert.sql")
@Sql(scripts = "/insertRole.sql")
public class TestBeansWithDb {
    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Test
    public void first() {
        List<User> allUsers = userService.getAllUsers();
        User       user     = allUsers.get(0);
        Assert.assertEquals("FIRST", user.getFirstName());
        Assert.assertEquals("LAST", user.getLastName());
    }


    @Test
    public void roleServiceTest() {
        List<Role> allRoles = roleService.getAllRoles();
        Assert.assertEquals(1, allRoles.size());
    }

    @Test
    public void roleServiceDaoTest() {
        List<Role> allRoles = roleService.getAllRolesDao();
        Assert.assertEquals(1, allRoles.size());
    }

    @Test
    public void findByTest() {
        Assert.assertEquals(1, roleService.find("test", 1L).size());
    }
}
