package net.fernandosimon.emp_control.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author developer
 * @date 2020-01-12
 * @time 21:19
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MissingNameException extends RuntimeException {

    public MissingNameException(String message) {
        super(message);
    }
}
