package com.afghl.restaurant.infrastructure.exception;

public class InvalidParamException extends ServiceException {

    public InvalidParamException(String message) {
        super(message);
    }

    public InvalidParamException(Throwable cause) {
        super(cause);
    }
}
