package com.afghl.restaurant.authority.service;

import com.afghl.restaurant.authority.domain.user.UserRole;

public interface AuthService {
    boolean verifyUserRole(Long userId, UserRole role);
}
