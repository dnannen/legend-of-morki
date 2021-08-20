package model.allies.siegeweapons.weapons;

import model.allies.siegeweapons.ASiegeWeapon;
import model.map.Tile;

public class Catapult extends ASiegeWeapon {

    public Catapult(Tile tile) {
        super(100, 80, 0, 0.2, 5, 0, true, tile);
    }
}
