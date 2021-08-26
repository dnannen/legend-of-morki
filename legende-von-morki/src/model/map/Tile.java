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

    private final Map MAP;
    private boolean isPath;
    private boolean isScenery;
    private boolean hasTower;

    Tile(Map map, int id, int x, int y) {
        this.MAP = map;
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

    public List<Tile> getSurroundingTiles(Map map) {
        List<Tile> range = new ArrayList<>(8);
        int[] nextX = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
        int[] nextY = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int x = this.getCoordinates().get(0) + nextX[i];
            int y = this.getCoordinates().get(1) + nextY[i];

            if (x >= 1 && x <= 10 && y >= 1 && y <= 10) {
                range.add(map.getTile(x, y));
            }
        }

        return range;
    }

    public Map getMap() {
        return this.MAP;
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

    public boolean hasTower() {
        return this.hasTower;
    }

    public void setTower(boolean set) {
        if (set) {
            this.tower = new Tower(this);
            this.hasTower = true;
        } else {
            this.tower = null;
            this.hasTower = false;
        }
    }

    public Tower getTower() {
        return this.tower;
    }
}
