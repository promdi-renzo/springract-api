package springboot.crud.springboot.crud.service.mapper;

import org.springframework.stereotype.Component;
import springboot.crud.springboot.crud.controller.dto.getUsers.HttpGetUsersBody;
import springboot.crud.springboot.crud.controller.dto.getUsers.HttpGetUsersResponse;
import springboot.crud.springboot.crud.controller.dto.getUsers.HttpGetUsersResponseBody;
import springboot.crud.springboot.crud.entity.User;

import java.util.List;

@Component
public class GetUsersMapper {

    public HttpGetUsersResponse getUsersSuccess(List<User> user){

        HttpGetUsersBody body = new HttpGetUsersBody();
        body.setUsers(user);

        HttpGetUsersResponseBody responseBody = new HttpGetUsersResponseBody();
        responseBody.setBody(body);
        responseBody.setMessage("Get Users Successful");
        responseBody.setStatusCode("200");

        HttpGetUsersResponse response = new HttpGetUsersResponse();
        response.setResponse(responseBody);

        return response;
    }


    public HttpGetUsersResponse getUsersNotFound(){

        HttpGetUsersBody body = new HttpGetUsersBody();
        body.setUsers(null);

        HttpGetUsersResponseBody responseBody = new HttpGetUsersResponseBody();
        responseBody.setBody(body);
        responseBody.setMessage("Users Not Found");
        responseBody.setStatusCode("400");

        HttpGetUsersResponse response = new HttpGetUsersResponse();
        response.setResponse(responseBody);

        return response;
    }

    public HttpGetUsersResponse getUserFailed(){

        HttpGetUsersBody body = new HttpGetUsersBody();
        body.setUsers(null);

        HttpGetUsersResponseBody responseBody = new HttpGetUsersResponseBody();
        responseBody.setBody(body);
        responseBody.setMessage("Get User Failed");
        responseBody.setStatusCode("404");

        HttpGetUsersResponse response = new HttpGetUsersResponse();
        response.setResponse(responseBody);

        return response;
    }

}
