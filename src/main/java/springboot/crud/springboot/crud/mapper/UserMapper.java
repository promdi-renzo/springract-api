package springboot.crud.springboot.crud.mapper;

import org.springframework.stereotype.Component;
import springboot.crud.springboot.crud.controller.dto.saveuser.HttpSaveUserRequest;
import springboot.crud.springboot.crud.entity.User;

@Component
public class UserMapper {

    public User httpSaveUserRequestToUser(HttpSaveUserRequest request){
        User user = new User();
        user.setId(0);
        user.setFirstname(request.getFirstname());
        user.setLastname(request.getLastname());
        user.setImage(request.getImage());
        user.setAge(request.getAge());

        return user;
    }

}
