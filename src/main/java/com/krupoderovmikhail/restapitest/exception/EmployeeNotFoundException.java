package com.krupoderovmikhail.restapitest.exception;

/**
 * @author Krupoderov Mikhail
 */
public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super(String.format("Employee with Id %d not found", id));
    }

    public EmployeeNotFoundException(String username) {
        super(String.format("Employee with Username %s not found", username));
    }
}
