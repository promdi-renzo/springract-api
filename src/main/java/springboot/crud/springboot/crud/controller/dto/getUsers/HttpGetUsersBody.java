package springboot.crud.springboot.crud.controller.dto.getUsers;

import lombok.Data;
import springboot.crud.springboot.crud.entity.User;

import java.util.List;

@Data
public class HttpGetUsersBody {
    private List<User>
            users;
}
