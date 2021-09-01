package model.game;

import model.AGameEntity;
import model.map.Map;

public class GameField extends Map {

    public GameField(int xLength, int yWidth) {
        super(xLength, yWidth);
    }

    public boolean move(AGameEntity a) {
        a.getTile().removeUnit(a);
        for(int i = 0; i < this.getEnemyPath().size(); i++) {
            if (a.getTile().equals(this.getEnemyPath().get(i))) {
                this.getEnemyPath().get(i + 1).enterUnit(a);
                a.setTile(this.getEnemyPath().get(i + 1));
                return true;
            }
        }
        return false;
    }
}
