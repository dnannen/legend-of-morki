package model.game.interactionExceptions;

public class InvalidUnitPlacementException extends Exception {

    public InvalidUnitPlacementException(String errorMessage) {
        super(errorMessage);
    }
}
