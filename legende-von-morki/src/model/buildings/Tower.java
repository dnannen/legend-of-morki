package model.buildings;

import model.map.Tile;

public class Tower extends AActiveBuilding {

    private int level;

    public Tower(Tile tile) {
        this.level = 1;
        this.setHP(300);
        this.setMaintained(false);
    }

}