package logic.defenders.soldiers;

import logic.AGameEntity;
import logic.field.Tile;

public class Archer extends AGameEntity {

    public Archer() {
        this.setHp(30);
        this.setDmg(14);
        this.setAttackspeed(0.5);
        this.setAlive(true);
        this.setAoe(false);
    }

    /**
     * Minus one defender.
     */
    public void die() {
        this.setAlive(false);
        //Does nothing when it dies
    }

}
