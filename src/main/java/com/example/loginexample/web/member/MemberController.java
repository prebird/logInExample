package com.example.loginexample.web.member;

import com.example.loginexample.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/member")
@RequiredArgsConstructor
public class MemberController {
    private static MemberService memberService;

    @GetMapping("/add")
    public String addForm(@ModelAttribute MemberDto memberDto) {
        return "member/addMemberForm";
    }

    @PostMapping("/add")
    public String createMember(MemberDto memberDto) {

        return "home";
    }

    @PostMapping("/logIn")
    public String logIn(LogInDto loginDto) {
        if (memberService.logIn(loginDto.getMemberId(), loginDto.getPassword())) {
            return "home";
        }
        return "";
    }
}
