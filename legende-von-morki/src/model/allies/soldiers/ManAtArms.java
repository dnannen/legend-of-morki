package model.allies.soldiers;

import model.allies.AAlly;
import model.map.Tile;

public class ManAtArms extends AAlly {

    public ManAtArms(Tile tile) {
        super(50, 25, 0.4, 0.5, 24, 0, false, tile);
    }
}
