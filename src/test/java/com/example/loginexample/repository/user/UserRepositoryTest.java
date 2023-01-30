package com.example.loginexample.repository.user;

import com.example.loginexample.domain.user.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void 유저_생성_테스트 () throws Exception {
        // given
        User user = new User("test1", "1234", "kim");

        // when
        userRepository.save(user);

        // then
        User findUser = userRepository.findOne(user.getId());
        Assertions.assertThat(findUser.getId()).isEqualTo(user.getId());
    }

}
