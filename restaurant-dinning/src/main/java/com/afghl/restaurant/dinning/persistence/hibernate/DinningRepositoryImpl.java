package com.afghl.restaurant.dinning.persistence.hibernate;

import com.afghl.restaurant.dinning.domain.dinning.Dinning;
import com.afghl.restaurant.dinning.domain.dinning.DinningRepository;
import com.afghl.restaurant.infrastructure.persistence.hibernate.HibernateRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DinningRepositoryImpl extends HibernateRepository implements DinningRepository {

    @Override
    public Dinning find(Long id) {
        return (Dinning) getSession().
                createQuery("from Dinning where id = ?").
                setParameter(0, id).uniqueResult();
    }
}
