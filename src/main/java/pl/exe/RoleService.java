package pl.exe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pl.value.MyDbConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.BitSet;
import java.util.List;

@Service
public class RoleService {

    @PersistenceContext
    EntityManager entityManager;

    PermissionService permissionService;

    String serviceNames[];

    @Value("${mydbconfig}")
    MyDbConfig config;

    private RoleDAO rolesDao;

    @PostConstruct
    public void init() {
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("preDestroy");
    }

    public RoleService(PermissionService permissionService, RoleDAO rolesDao) {
        this.permissionService = permissionService;
        this.rolesDao = rolesDao;
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


    public String testMethod() {
        return "RoleService " + permissionService.testMethod();
    }

    public List<Role> getAllRoles(){
        return entityManager.createQuery("select r from Role r", Role.class).getResultList();
    }

    public List<Role> getAllRolesDao(){
        return rolesDao.findAll();
    }

    public List<Role> find(String name, Long id) {
        return rolesDao.findAllByNameAndId(name, id);
    }
}
