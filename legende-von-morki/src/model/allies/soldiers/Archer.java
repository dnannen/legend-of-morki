package model.allies.soldiers;

import model.allies.AAlly;
import model.map.Tile;

public class Archer extends AAlly {

    public Archer(Tile tile) {
        super(30, 14, 0, 0.5, 2, 0, false, tile);
    }
}
