package com.afghl.restaurant.authority.service.impl;

import com.afghl.restaurant.authority.domain.user.User;
import com.afghl.restaurant.authority.domain.user.UserRepository;
import com.afghl.restaurant.authority.domain.user.UserRole;
import com.afghl.restaurant.authority.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository repository;

    @Override
    public boolean verifyUserRole(Long userId, UserRole role) {
        if (Objects.isNull(userId) || userId <= 0) {
            return false;
        }

        if (Objects.isNull(role)) {
            return true;
        }
        User user = repository.find(userId);
        return Objects.nonNull(user) && user.hasRole(role);
    }
}
