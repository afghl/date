package com.afghl.restaurant.dinning.service.impl;

import com.afghl.restaurant.dinning.domain.dinning.Dinning;
import com.afghl.restaurant.dinning.domain.dinning.DinningRepository;
import com.afghl.restaurant.dinning.service.DinningService;
import com.afghl.restaurant.infrastructure.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
class DinnerServiceImpl implements DinningService {
    @Autowired
    private DinningRepository repository;

    @Override
    public long createNewDinning(Long userId, Long tableId) throws ServiceException {
        return 0;
    }
}
