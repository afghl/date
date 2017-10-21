package com.afghl.restaurant.exception;

public class WebException extends Exception {
    public WebException(String message) {
        super(message);
    }

    public WebException(Throwable cause) {
        super(cause);
    }
}
