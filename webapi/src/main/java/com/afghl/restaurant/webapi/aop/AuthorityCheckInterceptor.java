package com.afghl.restaurant.webapi.aop;

import com.afghl.restaurant.authority.domain.user.UserRole;
import com.afghl.restaurant.authority.service.AuthService;
import com.afghl.restaurant.exception.NotAuthException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthorityCheckInterceptor {

    @Autowired
    private AuthService authService;

    @Pointcut("execution(* com.afghl.restaurant.webapi.controller.*.*(..))")
    public void pointcut() {
    }

    @Around("pointcut() && @annotation(cut)")
    public Object log(ProceedingJoinPoint pjp, AuthorityCheck cut) throws Throwable {
        Long userId = (long) pjp.getArgs()[0];
        UserRole role = cut.role();

        if (!authService.verifyUserRole(userId, role)) {
            throw new NotAuthException(
                    String.format("user: %s doesn't has role: %s", userId, role.name())
            );
        }

        return pjp.proceed();
    }
}
