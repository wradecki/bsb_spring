package pl.exe;

import org.springframework.beans.factory.annotation.Autowired;

public class RoleService {
    PermissionService permissionService;

    public RoleService() {
    }

    public RoleService(PermissionService permissionService) {
        this.permissionService = permissionService;
        System.out.println("RoleService");
    }

    @Autowired
    public void setPermissionService(PermissionService permissionService) {
        System.out.println("setter");
        this.permissionService = permissionService;
    }
}
