package model.enemies.grunts;

import model.enemies.AEmeny;
import model.map.Tile;

public class Sprinter extends AEmeny {

    public Sprinter(Tile tile) {
        super(10, 30, 10, 0.7, 0, 0, false, tile);
    }
}
