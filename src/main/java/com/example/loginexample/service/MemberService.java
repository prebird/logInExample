package com.example.loginexample.service;

import com.example.loginexample.domain.member.Member;
import com.example.loginexample.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private static MemberRepository memberRepository;

    public void createMember(Member member) {
        memberRepository.save(member);
    }

    public Boolean logIn(String logInId, String password) {
        Member member = memberRepository.findByLogIdAndPassword(logInId, password);
        if (member != null) return true;
        return false;
    }
}
