package model.allies.siegeweapons.weapons;

import model.allies.AAlly;
import model.map.Tile;

public class Catapult extends AAlly {

    public Catapult(Tile tile) {
        super(100, 80, 0, 0.2, 5, 0, true, tile);
    }
}
