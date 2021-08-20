package model.map;

import model.AGameEntity;
import model.buildings.Tower;

import java.util.ArrayList;
import java.util.List;

public class Tile {

    private final int ID;
    private final List<Integer> COORDINATES = new ArrayList<>();

    private ArrayList<AGameEntity> currentUnitsOnTile;
    private Tower tower;

    private boolean isPath;
    private boolean isScenery;
    private boolean hasTower;

    Tile(int id, int x, int y) {
        this.ID = id;
        this.COORDINATES.add(x);
        this.COORDINATES.add(y);
        this.currentUnitsOnTile = new ArrayList<>();
    }

    public int getID() {
        return this.ID;
    }

    public List<Integer> getCoordinates() {
        return this.COORDINATES;
    }

    public ArrayList<AGameEntity> getCurrentUnitsOnTile() {
        return this.currentUnitsOnTile;
    }

    public void enterUnit(AGameEntity unit) {
        if (unit.getSpeed() > 0 && this.isPath) {
            this.currentUnitsOnTile.add(unit);
        }
    }

    public void removeUnit(AGameEntity unit) {
        this.currentUnitsOnTile.remove(unit);
    }

    public void dealAoeDamage(int dmg) {
        for (AGameEntity currentUnit : this.currentUnitsOnTile) {
            currentUnit.setHp(currentUnit.getHp() - (dmg - currentUnit.getArmour()));
        }
    }

    //TODO doesnt work for tiles on the map's fringe
    public List<Tile> getSurroundingTiles(Map map) {
        List<Tile> range = new ArrayList<>(8);
        int[] next = new int[] {-11, -10, -9, -1, 1, 9, 10, 11};

        for (int i : next) {
            if (this.getID() + i > 0 && this.getID() + i < 99) {
                range.add(map.getTileFromID(this.getID() + i));
            }
        }

        return range;
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

    public void placeTower() {
        if (!(this.hasTower || this.isPath || this.isScenery)) {
            this.hasTower = true;
            this.tower = new Tower(this);
            this.currentUnitsOnTile = null;
        }
    }

    public void hasTower(boolean t) {
        this.hasTower = t;
    }

    public Tower getTower() {
        return this.tower;
    }
}
