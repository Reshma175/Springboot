package Crus_Springboot.CrudSpringboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class OutOfStack extends RuntimeException{

    public OutOfStack(String message){
        super(message);
    }
}
