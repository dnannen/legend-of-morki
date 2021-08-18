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

    //TODO need lots of safety nets to avoid fault-states

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

    public void placeTower() {
        //TODO add exception for this
        if (!(this.hasTower || this.isPath || this.isScenery)) {
            this.hasTower = true;
            this.tower = new Tower(this);
            this.currentUnitsOnTile = null;
        } else {
            System.out.println("erorr");
        }
    }

    public void hasTower(boolean t) {
        this.hasTower = t;
    }

    public Tower getTower() {
        return this.tower;
    }
}
