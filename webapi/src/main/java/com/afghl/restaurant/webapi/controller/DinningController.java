package com.afghl.restaurant.webapi.controller;

import com.afghl.restaurant.authority.domain.user.UserRole;
import com.afghl.restaurant.dinning.domain.dinning.Dinning;
import com.afghl.restaurant.dinning.service.DinningService;
import com.afghl.restaurant.webapi.aop.AuthorityCheck;
import com.afghl.restaurant.webapi.dto.DinningDto;
import com.afghl.restaurant.webapi.transformer.DinningTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinningController {
    @Autowired
    private DinningService service;
    @Autowired
    private DinningTransformer transformer;

    @RequestMapping(path = "/api/dinning")
    @AuthorityCheck(role = UserRole.CUSTOMER)
    public DinningDto get(Long userId) {
        System.out.println(userId);
        Dinning dinning = service.get((long) 1);
        System.out.printf("dinning: " + dinning);
        return transformer.transDinning(dinning);
    }
}
