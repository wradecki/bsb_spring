package pl.exe;

public class RoleService {
    PermissionService permissionService;

    public RoleService() {
    }

    public RoleService(PermissionService permissionService) {
        this.permissionService = permissionService;
        System.out.println("RoleService");
    }

    public void setPermissionService(PermissionService permissionService) {
        System.out.println("setter");
        this.permissionService = permissionService;
    }
}
