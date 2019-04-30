package com.htp.repository.hibernate;

import com.htp.domain.User;
import com.htp.domain.hibernate.TestUser;
import com.htp.repository.GenericDao;

import java.util.List;

public interface HibernateUser extends GenericDao<TestUser, Long> {
}
