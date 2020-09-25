package com.krupoderovmikhail.restapitest.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author Krupoderov Mikhail
 */
@Data
@AllArgsConstructor
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;
}
