package model.game.interactionExceptions;

public class InvalidTowerPlacementException extends Exception {

    public InvalidTowerPlacementException(String errorMessage) {
        super(errorMessage);
    }
}
