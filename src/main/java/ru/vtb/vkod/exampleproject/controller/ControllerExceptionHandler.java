package ru.vtb.vkod.exampleproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.vtb.vkod.exampleproject.exception.ExampleException;

@Log4j2
@ControllerAdvice
@RequiredArgsConstructor
public class ControllerExceptionHandler {
    @ExceptionHandler(ExampleException.class)
    public ResponseEntity<ResponseWrapper<ExampleException>> handleException(ExampleException e) {
        log.warn(e.getMessage());

        return new ResponseEntity<>(ResponseWrapper.<ExampleException>builder()
                .error(e.getClass().getName())
                .message(e.getMessage())
                .build(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ResponseWrapper<RuntimeException>> handleException(RuntimeException e) {
        log.error(e.getMessage());

        return new ResponseEntity<>(ResponseWrapper.<RuntimeException>builder()
                .error(e.getClass().getName())
                .message(e.getMessage())
                .build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}