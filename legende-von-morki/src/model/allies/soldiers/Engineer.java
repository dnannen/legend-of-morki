package model.allies.soldiers;

import model.allies.AAlly;
import model.map.Tile;

public class Engineer extends AAlly {

    public Engineer(Tile tile) {
        super(15, 5, 0, 1.25, 10, 2, false, tile);
    }

    //TODO check if there is a catapult or something like that on the turret then dont attack but give boost to the units
}
