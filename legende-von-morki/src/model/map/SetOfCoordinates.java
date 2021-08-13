package model.map;

public class SetOfCoordinates {

    private final int X_COORDINATE;
    private final int Y_COORDINATE;

    public SetOfCoordinates(int x, int y) {
        this.X_COORDINATE = x;
        this.Y_COORDINATE = y;
    }

    public int getX() {
        return this.X_COORDINATE;
    }

    public int getY() {
        return this.Y_COORDINATE;
    }
}
