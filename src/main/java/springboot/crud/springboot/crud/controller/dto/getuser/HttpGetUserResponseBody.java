package springboot.crud.springboot.crud.controller.dto.getuser;

import lombok.Data;

@Data
public class HttpGetUserResponseBody {
    private String
            message,
            statusCode;
    private HttpGetUserBody
            body;
}
