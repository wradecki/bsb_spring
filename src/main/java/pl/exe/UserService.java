package pl.exe;

import org.springframework.stereotype.Service;

@Service
public class UserService {


    private RoleService roleService;

    public UserService(RoleService roleService) {
        this.roleService = roleService;
        System.out.println("UserService");
    }
}
