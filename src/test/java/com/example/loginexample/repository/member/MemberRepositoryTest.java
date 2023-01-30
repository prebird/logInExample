package com.example.loginexample.repository.member;

import com.example.loginexample.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired
    MemberRepository userRepository;

    @Test
    public void 유저_생성_조회_테스트 () throws Exception {
        // given
        Member member = new Member("test1", "1234", "kim");

        // when
        userRepository.save(member);

        // then
        Member findMember = userRepository.findById(member.getId());
        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
    }

}
