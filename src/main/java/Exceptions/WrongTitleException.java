package Exceptions;

public class WrongTitleException extends RuntimeException {
    public WrongTitleException(String message) {
        super(message);
    }
}
