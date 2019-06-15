package pl.exe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Transactional
public interface PermissionDAO extends JpaRepository<Permission, Long> {
    public Permission findByIdAndCreateDateBetween(Long id, Date startDate, Date endDate);
}
