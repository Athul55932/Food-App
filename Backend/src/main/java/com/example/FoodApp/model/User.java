package com.example.FoodApp.model;

import com.example.FoodApp.enums.Role;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String email;
    private String password; // hashed
    private String name;
    private String phoneNumber; // 10 chars only
    private Role role;
    private String address;
}
