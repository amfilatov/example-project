package ru.vtb.vkod.exampleproject.exception;

public class ExampleException extends RuntimeException {
    public ExampleException() {
    }

    public ExampleException(String message) {
        super(message);
    }

    public ExampleException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExampleException(Throwable cause) {
        super(cause);
    }
}
