package com.example.loginexample.repository.member;

import com.example.loginexample.domain.member.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findById(Long id) {
        return em.find(Member.class ,id);
    }

    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    public Member findByLoginId(String logInId) {
        return em.createQuery("select m from Member m where m.logInId = :logInId", Member.class)
                .setParameter("logInId", logInId)
                .getSingleResult();
    }

    public Member findByLogIdAndPassword(String logInId, String password) {
        return em.createQuery("select m from Member m " +
                "where m.logInId = :logInId " +
                "and m.password = :password", Member.class)
                .setParameter("logInId", logInId)
                .setParameter("password", password)
                .getSingleResult();
    }

}
