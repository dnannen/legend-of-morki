package model.enemies.grunts;

import model.enemies.AEnemy;

public class Sprinter extends AEnemy {

    public Sprinter() {
        super(10, 30, 10, 0.7, 0, false);
        this.setRange(this.getTile());
    }
}
