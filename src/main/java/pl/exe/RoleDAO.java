package pl.exe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface RoleDAO extends JpaRepository<Role, Long> {
}
