package org.example.programmering24h.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.context.request.WebRequest;


import java.nio.file.AccessDeniedException;
import java.util.Date;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class) //generel fejlhåndtering
    public ResponseEntity<ErrorMessage> globalExceptionHandler(Exception ex, WebRequest request) {
        ErrorMessage message = buildErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), request);
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NoHandlerFoundException.class) //håndterer forkerte endpoints
    public ResponseEntity<ErrorMessage> handleNotFound(NoHandlerFoundException ex, WebRequest request) {
        ErrorMessage message = buildErrorMessage(HttpStatus.NOT_FOUND, "Path not found: " + ex.getRequestURL(), request);
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AccessDeniedException.class) //håndterer forbudte fejl
    public ResponseEntity<ErrorMessage> handleAccessDeniedException(AccessDeniedException ex, WebRequest request) {
        return new ResponseEntity<>(
                buildErrorMessage(HttpStatus.FORBIDDEN, "you do not have acces to this ressource", request),
                HttpStatus.FORBIDDEN
        );
    }

    private ErrorMessage buildErrorMessage(HttpStatus status, String message, WebRequest request) {
        return new ErrorMessage(
                status.value(),
                new Date(),
                message,
                request.getDescription(false)
        );
    }


}
