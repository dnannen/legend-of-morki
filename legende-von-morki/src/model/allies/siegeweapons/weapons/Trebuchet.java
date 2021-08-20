package model.allies.siegeweapons.weapons;

import model.allies.siegeweapons.ASiegeWeapon;
import model.map.Tile;

public class Trebuchet extends ASiegeWeapon {

    public Trebuchet(Tile tile) {
        super(200, 144, 0, 0.05, 15, 0, true, tile);
    }
}
