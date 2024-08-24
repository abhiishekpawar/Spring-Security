package com.demo.BasicAuth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class User {
    @Id
    private int id;
    private String username;
    private String password;
}
