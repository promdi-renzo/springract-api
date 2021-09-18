package springboot.crud.springboot.crud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "image_url")
    private String image;
    @Column(name = "fname")
    private String firstname;
    @Column(name = "lname")
    private String lastname;
    @Column(name = "age")
    private int age;
}
