package model.allies.soldiers;

import model.allies.AAlly;
import model.map.Tile;

public class Engineer extends AAlly {

    public Engineer(Tile tile) {
        super(15, 5, 0, 1.25, 10, 2, false, tile);
    }
}
