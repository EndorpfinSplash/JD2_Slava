package com.htp.repository.hibernate;

import com.htp.domain.hibernate.Poll;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Qualifier("hibernatePollDao")
public class HibernatePollDao implements HibernatePoll {


    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public List<Poll> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select tu from Poll tu", Poll.class).list();
        }
    }

    @Override
    public Poll findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Poll save(Poll entity) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
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
    public Poll update(Poll entity) {
        return null;
    }
}
