package com.afghl.restaurant.dinning.persistence.hibernate;

import com.afghl.restaurant.dinning.domain.dinning.Dinning;
import com.afghl.restaurant.dinning.domain.dinning.DinningRepository;
import com.afghl.restaurant.infrastructure.persistence.hibernate.HibernateRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DinningRepositoryImpl extends HibernateRepository<Dinning> implements DinningRepository {
    @Override
    protected Class<Dinning> getModelType() {
        return Dinning.class;
    }
}
