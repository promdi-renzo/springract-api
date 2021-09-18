package springboot.crud.springboot.crud.controller.dto.getUsers;


import lombok.Data;

@Data
public class HttpGetUsersResponseBody {
    private String
            message,
            statusCode;
    private HttpGetUsersBody
            body;
}
