package homework03.PasswordValidator;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}