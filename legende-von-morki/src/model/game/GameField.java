package model.game;

import model.AGameEntity;
import model.map.Map;

public class GameField extends Map {

    public GameField(int xLength, int yWidth) {
        super(xLength, yWidth);
    }

    public boolean move(AGameEntity a) {
        a.getTile().removeUnit(a);
        for(int i = 0; i < this.getAlliedPath().size(); i++) {
            if (a.getTile().equals(this.getAlliedPath().get(i))) {
                this.getAlliedPath().get(i + 1).enterUnit(a);
                a.setTile(this.getAlliedPath().get(i + 1));
                return true;
            }
        }
        return false;
    }
}
