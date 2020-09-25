package com.krupoderovmikhail.restapitest.exception;

/**
 * @author Krupoderov Mikhail
 */
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super(String.format("User with Id %d not found", id));
    }

    public UserNotFoundException(String username) {
        super(String.format("User with Username %s not found", username));
    }
}
