package pl.exe;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {

    private JdbcTemplate template;

    private String clearTestVariable = "clearTestVariable";

    private RoleService roleService;

    public UserService(RoleService roleService, JdbcTemplate jdbcTemplate) {
        this.roleService = roleService;
        this.template = jdbcTemplate;
        System.out.println("UserService");
    }

    public List<User> getAllUsers(){
        return template.query("select * from users", new UserRowMapper());
    }

    public String testMethod(){
        return "UserService " + roleService.testMethod();
    }

    public String getClearTestVariable() {
        return clearTestVariable;
    }

    public void changeTestVariable(String variable) {
        clearTestVariable = variable;
    }

    static class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            return new User(resultSet.getString("first_name"), resultSet.getString("last_name"));
        }
    }
}
