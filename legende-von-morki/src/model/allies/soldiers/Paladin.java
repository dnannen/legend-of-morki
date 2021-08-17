package model.allies.soldiers;

import model.allies.AAlly;
import model.map.Tile;

public class Paladin extends AAlly {

    private final int MAX_HP = 30;

    public Paladin(Tile tile) {
        super(70, 25, 3, 0.3, 30, 5, false, tile);
    }

    @Override
    public void die() {
        int random = (int) (Math.random() * 10);
        if (random == 4 || random == 2 || random == 0) {
            //blaze it
            this.setHp(MAX_HP / 2);
            this.setDmg(this.getDmg() * 2);
        } else {
            this.setHp(0);
            //TODO delete instead of set 0?
        }
    }
}
