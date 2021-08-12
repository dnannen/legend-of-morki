package model.map;

import model.AGameEntity;

import java.util.ArrayList;

public class Tile {

    private ArrayList<AGameEntity> currentUnitsOnTile;
    private SetOfCoordinates coordinates;

    Tile(int x, int y) {
        this.coordinates.setX(x);
        this.coordinates.setY(y);
        this.currentUnitsOnTile = new ArrayList<AGameEntity>();
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
        this.currentUnitsOnTile.remove(this.currentUnitsOnTile.size());
    }

    public boolean isEmpty() {
        return (this.currentUnitsOnTile.isEmpty());
    }

    public void dealAoeDamage(int dmg) {
        for (AGameEntity currentUnit : this.currentUnitsOnTile) {
            int damage = dmg;
            damage = dmg - currentUnit.getArmour();
            currentUnit.setHp(currentUnit.getHp() - damage);
            //TODO this is better in a handler
            if (currentUnit.getHp() <= 0) {
                currentUnit.die();
            }
        }
    }
}
