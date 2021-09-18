package springboot.crud.springboot.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.crud.springboot.crud.controller.dto.getUsers.HttpGetUsersResponse;
import springboot.crud.springboot.crud.controller.dto.getuser.HttpGetUserRequest;
import springboot.crud.springboot.crud.controller.dto.getuser.HttpGetUserResponse;
import springboot.crud.springboot.crud.controller.dto.saveuser.HttpSaveUserRequest;
import springboot.crud.springboot.crud.controller.dto.saveuser.HttpSaveUserResponse;
import springboot.crud.springboot.crud.entity.User;
import springboot.crud.springboot.crud.mapper.UserMapper;
import springboot.crud.springboot.crud.service.UserService;
import springboot.crud.springboot.crud.service.mapper.GetUserMapper;
import springboot.crud.springboot.crud.service.mapper.GetUsersMapper;
import springboot.crud.springboot.crud.service.mapper.SaveUserMapper;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class UserController {
    @Autowired
    private UserService service;
    @Autowired
    private GetUserMapper getUserMapper;
    @Autowired
    private GetUsersMapper getUsersMapper;
    @Autowired
    private SaveUserMapper saveUserMapper;
    @Autowired
    private UserMapper userMapper;



    @GetMapping("/users")
    public ResponseEntity<HttpGetUsersResponse> getUsers(){

        List<User> users = service.getUsers();

        if(!(users.isEmpty())){
            HttpGetUsersResponse successResponse = getUsersMapper.getUsersSuccess(users);
            return new ResponseEntity<>(successResponse, HttpStatus.OK);

        }else if(users.isEmpty()){
            HttpGetUsersResponse notFoundResponse = getUsersMapper.getUsersNotFound();
            return new ResponseEntity<>(notFoundResponse, HttpStatus.OK);
        }
        HttpGetUsersResponse failedResponse = getUsersMapper.getUserFailed();
        return new ResponseEntity<>(failedResponse, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/user")
    public ResponseEntity<HttpGetUserResponse> getUser(@RequestBody HttpGetUserRequest request){

        Optional<User> user = service.getUser(request.getId());

        if(user.isPresent()){
            HttpGetUserResponse successResponse = getUserMapper.getUserSuccess(user.get());
            return new ResponseEntity<>(successResponse, HttpStatus.OK);
        }else if(!(user.isPresent())){
            HttpGetUserResponse notFoundResponse = getUserMapper.getUserNotFound();
            return new ResponseEntity<>(notFoundResponse, HttpStatus.NOT_FOUND);
        }

        HttpGetUserResponse failedResponse = getUserMapper.getUserFailed();
        return new ResponseEntity<>(failedResponse, HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/user")
    public ResponseEntity<HttpSaveUserResponse> createUser(@RequestBody HttpSaveUserRequest request){

        User user = userMapper.httpSaveUserRequestToUser(request);

        service.saveUser(user);
        return new ResponseEntity<>(saveUserMapper.saveUserSuccess(), HttpStatus.CREATED);
    }
}
