package main.exception;

public class InvalidDisplaySpecifiedException extends RuntimeException {
    public InvalidDisplaySpecifiedException(String reason) {
        super(reason);
    }
}
