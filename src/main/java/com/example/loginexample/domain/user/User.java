package com.example.loginexample.domain.user;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    private String id;
    private String password;
    private String userName;

    public User(String id, String password, String userName) {
        this.id = id;
        this.password = password;
        this.userName = userName;
    }
}
