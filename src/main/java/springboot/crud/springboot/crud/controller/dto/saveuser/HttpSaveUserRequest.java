package springboot.crud.springboot.crud.controller.dto.saveuser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HttpSaveUserRequest {
    private String image;
    private String firstname;
    private String lastname;
    private int age;
}
