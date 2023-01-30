package com.example.loginexample.domain.member;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id @GeneratedValue
    private Long id;
    @NotEmpty
    private String logInId;
    @NotEmpty
    private String password;
    @NotEmpty
    private String userName;

    public Member(String logInId, String password, String userName) {
        this.logInId = logInId;
        this.password = password;
        this.userName = userName;
    }

    public Member(Long id, String logInId, String password, String userName) {
        this(logInId, password, userName);
        this.id = id;
    }
}
