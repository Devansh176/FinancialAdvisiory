package financial.advisory.repo;

import financial.advisory.entity.Users_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Users_repo extends JpaRepository <Users_entity,Integer> {
    List<Users_entity> findByUserId(int userId);
    List<Users_entity> findByName(String name);
    Users_entity findByEmail(String email);
    Users_entity findByNameAndPassword(String username, String password);
}
