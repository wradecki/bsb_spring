package pl.exe;

import java.util.Date;
import java.util.List;

public class PermissionService {
    private PermissionDAO permissionDAO;

    public PermissionService(PermissionDAO permissionDAO) {
        this.permissionDAO = permissionDAO;
        System.out.println("PermissionService");
    }

    public String testMethod() {
        return "PermissionService";
    }

    public Permission findByIdAndCreateDateBetween(Long id, Date startDate, Date endDate){
        return permissionDAO.findByIdAndCreateDateBetween(id, startDate, endDate);
    }
}
