package springboot.crud.springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.crud.springboot.crud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
