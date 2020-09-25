package com.krupoderovmikhail.restapitest.exception;

/**
 * @author Krupoderov Mikhail
 */
public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException() {
        super("Data not found");
    }
}
