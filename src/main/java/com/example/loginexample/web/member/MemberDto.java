package com.example.loginexample.web.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberDto {
    private String logInId;
    private String password;
    private String userName;
}
