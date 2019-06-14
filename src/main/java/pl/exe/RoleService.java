package pl.exe;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import pl.value.MyDbConfig;

import javax.annotation.PostConstruct;

public class RoleService implements InitializingBean {
    PermissionService permissionService;

    String serviceNames[];

    @Value("${mydbconfig}")
    MyDbConfig config;

    public RoleService() {
    }

    @PostConstruct
    public void init() {
        System.out.println("postConstruct");
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

        System.out.println(config);

        this.serviceNames = serviceNames;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
