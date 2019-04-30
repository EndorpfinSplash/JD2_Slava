package com.htp.repository.hibernate;

import com.htp.config.hibernate.HibernateUtil;
import com.htp.domain.User;
import com.htp.domain.hibernate.TestUser;
import com.htp.repository.UserDao;
import org.aspectj.weaver.ast.Test;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("hibernateUserDao")
public class HibernateUserDao implements HibernateUser {
    @Override
    public List<TestUser> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("select tu from TestUser tu", TestUser.class).list();
        }
    }

    @Override
    public TestUser findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public TestUser save(TestUser entity) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(entity);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        return entity;
    }

    @Override
    public TestUser update(TestUser entity) {
        return null;
    }
}
