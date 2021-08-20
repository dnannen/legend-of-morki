package model.enemies.grunts;

import model.enemies.AEnemy;
import model.map.Tile;

public class Tank extends AEnemy {

    public Tank(Tile tile) {
        super(100, 5, 1, 0.5, 25, 5, false, tile);
    }
}
