package springboot.crud.springboot.crud.service.mapper;

import org.springframework.stereotype.Component;
import springboot.crud.springboot.crud.controller.dto.saveuser.HttpSaveUserResponse;
import springboot.crud.springboot.crud.controller.dto.saveuser.HttpSaveUserResponseBody;

@Component
public class SaveUserMapper {

    public HttpSaveUserResponse saveUserSuccess(){

        HttpSaveUserResponseBody responseBody = new HttpSaveUserResponseBody();
        responseBody.setMessage("Save User Successful");
        responseBody.setStatusCode("201");

        HttpSaveUserResponse response = new HttpSaveUserResponse();
        response.setResponse(responseBody);

        return response;
    }


    public HttpSaveUserResponse saveUserFailed(){

        HttpSaveUserResponseBody responseBody = new HttpSaveUserResponseBody();
        responseBody.setMessage("Save User Failed");
        responseBody.setStatusCode("400");

        HttpSaveUserResponse response = new HttpSaveUserResponse();
        response.setResponse(responseBody);

        return response;
    }
}
