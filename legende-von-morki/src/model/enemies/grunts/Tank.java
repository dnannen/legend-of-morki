package model.enemies.grunts;

import model.enemies.AEmeny;
import model.map.Tile;

public class Tank extends AEmeny {

    public Tank(Tile tile) {
        super(100, 5, 1, 0.5, 25, 5, false, tile);
    }
}
