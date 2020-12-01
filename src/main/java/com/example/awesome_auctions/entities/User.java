package com.example.awesome_auctions.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    private String password;

    public User(String name, String phone, String email, String password) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password   ) {
        this.email = email;
        this.password = password;
    }
}
