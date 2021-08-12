package model.map;

public class SetOfCoordinates {

    private int xCoordinate;
    private int yCoordinate;

    public SetOfCoordinates(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public int getX() {
        return this.xCoordinate;
    }
    public void setX(int x) {
        this.xCoordinate = x;
    }

    public int getY() {
        return this.yCoordinate;
    }
    public void setY(int y) {
        this.yCoordinate = y;
    }
}
