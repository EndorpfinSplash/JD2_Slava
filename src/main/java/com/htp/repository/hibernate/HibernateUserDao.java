package com.htp.repository.hibernate;

import com.htp.config.hibernate.HibernateUtil;
import com.htp.domain.User;
import com.htp.domain.hibernate.TestUser;
import com.htp.repository.UserDao;
import org.aspectj.weaver.ast.Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("hibernateUserDao")
public class HibernateUserDao implements HibernateUser {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public List<TestUser> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select tu from TestUser tu", TestUser.class).list();
        }
    }

    @Override
    public TestUser findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select tu from TestUser tu where tu.userId =:id", TestUser.class).uniqueResult();
        }
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public TestUser save(TestUser entity) {
        return null;
    }

    @Override
    public TestUser update(TestUser entity) {
        return null;
    }
}
