package pl.exe;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pl.value.MyDbConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class RoleService implements InitializingBean {

    @PersistenceContext
    EntityManager entityManager;

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

    @PreDestroy
    public void destroy() {
        System.out.println("preDestroy");
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

    public String testMethod() {
        return "RoleService " + permissionService.testMethod();
    }

    public List<Role> getAllRoles(){
        return entityManager.createQuery("select r from Role r", Role.class).getResultList();
    }
}
