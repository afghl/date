package com.afghl.restaurant.infrastructure.persistence.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public abstract class HibernateRepository<T> {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        try {
            return sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            return sessionFactory.openSession();
        }
    }

    public T find(Long id) {
        return (T) getSession().
                createQuery(String.format("from %s where id = ?", getModelType().getSimpleName())).
                setParameter(0, id).uniqueResult();
    }

    protected abstract Class<T> getModelType();
}
