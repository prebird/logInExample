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
    private String loginId;
    @NotEmpty
    private String password;
    @NotEmpty
    private String userName;

    public Member(String loginId, String password, String userName) {
        this.loginId = loginId;
        this.password = password;
        this.userName = userName;
    }

    public Member(Long id, String loginId, String password, String userName) {
        this(loginId, password, userName);
        this.id = id;
    }
}
