package com.rich.harrison.exception;

public class SessionOutOfDateException extends RuntimeException {
    public SessionOutOfDateException(String message) {
        super(message);
    }
}
