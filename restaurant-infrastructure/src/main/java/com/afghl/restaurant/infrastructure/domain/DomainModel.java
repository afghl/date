package com.afghl.restaurant.infrastructure.domain;

import org.apache.commons.lang.builder.EqualsBuilder;

import java.util.Objects;

public abstract class DomainModel {

    protected abstract Long getId();

    public boolean sameEntityAs(DomainModel other) {
        return Objects.nonNull(other) &&
                EqualsBuilder.reflectionEquals(getId(), other.getId());
    }

    public static boolean isIdValid(Long id) {
        return Objects.nonNull(id) && id > 0 && id < Long.MAX_VALUE;
    }

}
