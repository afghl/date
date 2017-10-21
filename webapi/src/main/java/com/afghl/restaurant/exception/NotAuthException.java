package com.afghl.restaurant.exception;

public class NotAuthException extends WebException {
    public NotAuthException(String message) {
        super(message);
    }

    public NotAuthException(Throwable cause) {
        super(cause);
    }
}
