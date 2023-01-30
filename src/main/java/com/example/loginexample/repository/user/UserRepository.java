package com.example.loginexample.repository.user;

import com.example.loginexample.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private static EntityManager em;

    public void save(User user) {
        em.persist(user);
    }

    public User findOne(String id) {
        return em.find(User.class ,id);
    }

    public List<User> findAll() {
        return em.createQuery("select u from User u", User.class)
                .getResultList();
    }

}
