package com.afghl.restaurant.webapi.controller;

import com.afghl.restaurant.authority.domain.user.UserRole;
import com.afghl.restaurant.dinning.domain.dinning.DinningTable;
import com.afghl.restaurant.dinning.service.DinningService;
import com.afghl.restaurant.infrastructure.exception.InvalidParamException;
import com.afghl.restaurant.exception.WebException;
import com.afghl.restaurant.infrastructure.exception.ServiceException;
import com.afghl.restaurant.webapi.aop.AuthorityCheck;
import com.afghl.restaurant.webapi.dto.DinningDto;
import com.afghl.restaurant.webapi.transformer.DinningTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class DinningController {
    @Autowired
    private DinningService service;
    @Autowired
    private DinningTransformer transformer;

    /**
     * 开始用餐
     * @param userId
     * @param tableId
     * @return
     */
    @RequestMapping(path = "/api/dinning", method = POST) @AuthorityCheck(role = UserRole.CUSTOMER)
    public long create(Long userId, Long tableId) throws WebException {
        try {
            return service.createNewDinning(userId, tableId);
        } catch (ServiceException e) {
            throw new WebException(e.getMessage());
        }
    }
}
