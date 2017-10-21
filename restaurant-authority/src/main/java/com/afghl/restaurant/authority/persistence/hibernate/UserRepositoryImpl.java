package com.afghl.restaurant.authority.persistence.hibernate;

import com.afghl.restaurant.authority.domain.user.User;
import com.afghl.restaurant.authority.domain.user.UserRepository;
import com.afghl.restaurant.infrastructure.persistence.hibernate.HibernateRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl extends HibernateRepository<User> implements UserRepository {
    @Override
    protected Class<User> getModelType() {
        return User.class;
    }
}
