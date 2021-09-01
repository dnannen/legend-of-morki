package model.game.interactionExceptions;

public class WrongUnitTypeException extends Exception {

    public WrongUnitTypeException(String errorMessage) {
        super(errorMessage);
    }
}
