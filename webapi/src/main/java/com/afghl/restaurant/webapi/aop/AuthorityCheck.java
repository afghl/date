package com.afghl.restaurant.webapi.aop;

import com.afghl.restaurant.authority.domain.user.UserRole;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AuthorityCheck {
    UserRole role();
}
