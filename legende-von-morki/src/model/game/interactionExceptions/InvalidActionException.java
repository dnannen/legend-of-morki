package model.game.interactionExceptions;

public class InvalidActionException extends Exception {

    public InvalidActionException(String errorMessage) {
        super(errorMessage);
    }
}
