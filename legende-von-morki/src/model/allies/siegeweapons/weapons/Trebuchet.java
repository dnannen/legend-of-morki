package model.allies.siegeweapons.weapons;

import model.allies.AAlly;
import model.map.Tile;

public class Trebuchet extends AAlly {

    public Trebuchet(Tile tile) {
        super(200, 144, 0, 0.05, 15, 0, true, tile);
    }
}
