package controler.interactionExceptions;

public class InvalidActionException extends Exception {

    public InvalidActionException(String errorMessage) {
        super(errorMessage);
    }
}
