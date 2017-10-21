package com.afghl.restaurant.authority.domain.user;

import com.afghl.restaurant.infrastructure.domain.DomainModel;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user")
public class User extends DomainModel {
    private final static String USER_TYPE_CUSTOMER = "CUSTOMER";
    private final static String USER_TYPE_WAITER = "WAITER";
    private final static String USER_TYPE_COOK = "COOK";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "user_type", nullable = false)
    private String userType;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private LocalDateTime updatedAt;

    public boolean hasRole(UserRole role) {
        return role == UserRole.ALL ||
                role == UserRole.CUSTOMER && USER_TYPE_CUSTOMER.equals(userType) ||
                role == UserRole.COOK && USER_TYPE_COOK.equals(userType) ||
                role == UserRole.WAITER && USER_TYPE_WAITER.equals(userType);
    }
}
