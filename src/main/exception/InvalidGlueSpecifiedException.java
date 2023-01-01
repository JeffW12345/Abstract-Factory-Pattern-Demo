package main.exception;

public class InvalidGlueSpecifiedException extends RuntimeException {
    public InvalidGlueSpecifiedException(String reason) {
        super(reason);
    }
}
