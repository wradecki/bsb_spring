package pl.exe;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private String clearTestVariable = "clearTestVariable";

    private RoleService roleService;

    public UserService(RoleService roleService) {
        this.roleService = roleService;
        System.out.println("UserService");
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
}
