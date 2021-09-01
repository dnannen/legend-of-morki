package model.enemies.grunts;

import model.enemies.AEnemy;

public class Tank extends AEnemy {

    public Tank() {
        super(100, 5, 1, 0.5, 25, false);
        this.setRange(this.getTile());
    }
}
