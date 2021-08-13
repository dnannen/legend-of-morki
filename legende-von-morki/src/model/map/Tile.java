package model.map;

import model.AGameEntity;
import model.map.SetOfCoordinates;

import java.util.ArrayList;

public class Tile {

    private ArrayList<AGameEntity> currentUnitsOnTile;
    private final SetOfCoordinates COORDINATES;

    private boolean isPath;
    private boolean isScenery;

    Tile(int x, int y) {
        this.COORDINATES = new SetOfCoordinates(x, y);
        this.currentUnitsOnTile = new ArrayList<>();
    }

    public ArrayList<AGameEntity> getCurrentUnitsOnTile() {
        return this.currentUnitsOnTile;
    }

    public void enterUnit(AGameEntity unit) {
        this.currentUnitsOnTile.add(unit);
    }

    public void removeUnit(AGameEntity unit) {
        this.currentUnitsOnTile.remove(unit);
    }

    public void removeForemostUnit() {
        this.currentUnitsOnTile.remove(this.currentUnitsOnTile.size() - 1);
    }

    public boolean isEmpty() {
        return (this.currentUnitsOnTile.isEmpty());
    }

    public void dealAoeDamage(int dmg) {
        for (AGameEntity currentUnit : this.currentUnitsOnTile) {
            int damage = dmg - currentUnit.getArmour();
            currentUnit.setHp(currentUnit.getHp() - damage);
            //TODO this is better in a handler
            if (currentUnit.getHp() <= 0) {
                currentUnit.die();
            }
        }
    }

    public boolean isPath() {
        return this.isPath;
    }

    public void setPathTile(boolean path) {
        this.isPath = path;
    }

    public boolean isScenery() {
        return this.isScenery;
    }

    public void setSceneryTile(boolean scenery) {
        this.isScenery = scenery;
    }
}
