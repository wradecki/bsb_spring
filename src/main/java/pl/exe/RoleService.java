package pl.exe;

import org.springframework.beans.factory.annotation.Autowired;

public class RoleService {
    PermissionService permissionService;

    String serviceNames[];

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

    public void setServiceName(String[] serviceNames) {
        System.out.print("setServiceName: [");
        System.out.print(String.join(", ", serviceNames));
        System.out.println("]");

        this.serviceNames = serviceNames;
    }
}
