package net.fernandosimon.emp_control.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author developer
 * @date 2020-01-12
 * @time 16:15
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CategoryIdException extends RuntimeException{

    public CategoryIdException(String message) {
        super(message);
    }
}
