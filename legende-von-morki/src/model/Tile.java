package model;

import java.util.List;

public class Tile {

    private int xCoordinate;
    private int yCoordinate;

    private List<AMapObject> currentObjects;

    private boolean isPath;
    private boolean isScenery;
    private boolean hasTower;

    public Tile(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    public List<AMapObject> getCurrentObjects() {
        return currentObjects;
    }

    public void addObject(AMapObject mapObject) {
        this.currentObjects.add(mapObject);
    }

    public void removeObject(AMapObject mapObject) {
        this.currentObjects.remove(mapObject);
    }

    public boolean isPath() {
        return isPath;
    }

    public void setPath(boolean path) {
        isPath = path;
    }

    public boolean isScenery() {
        return isScenery;
    }

    public void setScenery(boolean scenery) {
        isScenery = scenery;
    }

    public boolean isHasTower() {
        return hasTower;
    }

    public void setHasTower(boolean hasTower) {
        this.hasTower = hasTower;
    }
}
