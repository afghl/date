package com.afghl.restaurant.exception;

public class NotAuthException extends ServiceException {
    public NotAuthException(String message) {
        super(message);
    }

    public NotAuthException(Throwable cause) {
        super(cause);
    }
}
