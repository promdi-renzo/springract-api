package springboot.crud.springboot.crud.service;

import org.springframework.http.ResponseEntity;
import springboot.crud.springboot.crud.controller.dto.saveuser.HttpSaveUserResponse;
import springboot.crud.springboot.crud.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> getUser(int id);
    List<User> getUsers();
    void saveUser(User user);
}
