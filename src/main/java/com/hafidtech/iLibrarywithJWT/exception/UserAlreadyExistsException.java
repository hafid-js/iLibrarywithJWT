package com.hafidtech.iLibrarywithJWT.exception;

/**
 * @author Samson Effes
 */

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
