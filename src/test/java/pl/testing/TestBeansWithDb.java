package pl.testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.exe.*;

import javax.transaction.Transactional;
import java.util.Date;
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

    @Autowired
    PermissionService permissionService;

    @Autowired
    PermissionDAO permissionDAO;

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
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        Assert.assertEquals(1, roleService.find("test", 1L).size());
    }

    @Test
    public void permissionTestBetween() {
        Assert.assertNull(permissionService.findByIdAndCreateDateBetween(1L, new Date(), new Date()));
    }

    @Test
    @Transactional
    public void addAndFindTest() {
        Permission permission = new Permission();

        permission.id = 10L;
        permission.name = "perm";
        Date createDate = new Date();
        System.out.println(createDate);
        permission.setCreateDate(createDate);

        permissionDAO.save(permission);

        Date fromDate = new Date(1, 1, 1);
        System.out.println(fromDate);
        Date endDate = new Date(500,1,1);
        System.out.println(endDate);

        List<Permission> all = permissionDAO.findAll();
        System.out.println(all.size());
        Assert.assertEquals("perm", permissionService.findByIdAndCreateDateBetween(10L, fromDate, endDate).name);


    }
}
