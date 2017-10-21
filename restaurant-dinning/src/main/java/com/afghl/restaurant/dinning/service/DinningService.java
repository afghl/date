package com.afghl.restaurant.dinning.service;


import com.afghl.restaurant.dinning.domain.dinning.Dinning;
import com.afghl.restaurant.infrastructure.exception.ServiceException;

public interface DinningService {

    long createNewDinning(Long userId, Long tableId) throws ServiceException;

}
