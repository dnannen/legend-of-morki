package controler.interactionExceptions;

public class InvalidTowerPlacementException extends Exception {

    public InvalidTowerPlacementException(String errorMessage) {
        super(errorMessage);
    }
}
