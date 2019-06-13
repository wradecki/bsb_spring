package pl.exe;

public class RoleService {
    PermissionService permissionService;


    public RoleService(PermissionService permissionService) {
        this.permissionService = permissionService;
        System.out.println("RoleService");
    }
}
