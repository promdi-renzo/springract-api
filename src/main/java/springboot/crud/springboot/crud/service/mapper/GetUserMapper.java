package springboot.crud.springboot.crud.service.mapper;

import org.springframework.stereotype.Component;
import springboot.crud.springboot.crud.controller.dto.getuser.HttpGetUserBody;
import springboot.crud.springboot.crud.controller.dto.getuser.HttpGetUserResponse;
import springboot.crud.springboot.crud.controller.dto.getuser.HttpGetUserResponseBody;
import springboot.crud.springboot.crud.entity.User;


@Component
public class GetUserMapper {

    public HttpGetUserResponse getUserSuccess(User user){

        HttpGetUserBody body = new HttpGetUserBody();
        body.setUser(user);

        HttpGetUserResponseBody responseBody = new HttpGetUserResponseBody();
        responseBody.setBody(body);
        responseBody.setMessage("Get User Successful");
        responseBody.setStatusCode("200");

        HttpGetUserResponse response = new HttpGetUserResponse();
        response.setResponse(responseBody);

        return response;
    }


    public HttpGetUserResponse getUserNotFound(){

        HttpGetUserBody body = new HttpGetUserBody();
        body.setUser(null);

        HttpGetUserResponseBody responseBody = new HttpGetUserResponseBody();
        responseBody.setBody(body);
        responseBody.setMessage("User Not Found");
        responseBody.setStatusCode("400");

        HttpGetUserResponse response = new HttpGetUserResponse();
        response.setResponse(responseBody);

        return response;
    }

    public HttpGetUserResponse getUserFailed(){

        HttpGetUserBody body = new HttpGetUserBody();
        body.setUser(null);

        HttpGetUserResponseBody responseBody = new HttpGetUserResponseBody();
        responseBody.setBody(body);
        responseBody.setMessage("Get User Failed");
        responseBody.setStatusCode("404");

        HttpGetUserResponse response = new HttpGetUserResponse();
        response.setResponse(responseBody);

        return response;
    }


}
