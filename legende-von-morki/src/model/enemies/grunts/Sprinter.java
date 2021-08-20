package model.enemies.grunts;

import model.enemies.AEnemy;
import model.map.Tile;

public class Sprinter extends AEnemy {

    public Sprinter(Tile tile) {
        super(10, 30, 10, 0.7, 0, 0, false, tile);
    }
}
