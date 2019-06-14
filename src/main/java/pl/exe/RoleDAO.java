package pl.exe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;


public interface RoleDAO extends JpaRepository<Role, Long> {
    public List<Role> findAllByNameAndId(String name, Long id);
}
