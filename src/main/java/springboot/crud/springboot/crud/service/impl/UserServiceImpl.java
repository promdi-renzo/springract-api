package springboot.crud.springboot.crud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.crud.springboot.crud.controller.dto.saveuser.HttpSaveUserResponse;
import springboot.crud.springboot.crud.entity.User;
import springboot.crud.springboot.crud.repository.UserRepository;
import springboot.crud.springboot.crud.service.UserService;
import springboot.crud.springboot.crud.service.mapper.SaveUserMapper;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private SaveUserMapper saveUserMapper;

    @Override
    public Optional<User> getUser(int id) {

        return repository.findById(id);
    }

    @Override
    public List<User> getUsers() {
        return repository.findAll();
    }

    @Override
    public void saveUser(User user) {

        try {
            repository.save(user);
        }catch (Exception e){
            System.out.println("Failed");
        }
    }


}
