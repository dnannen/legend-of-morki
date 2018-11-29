package logic.attackers;

import logic.AGameEntity;

public class Sprinter extends AGameEntity {

    /**
     * Creates a new instance of a Sprinter
     */
    public Sprinter() {
        this.setHp(10);
        this.setDmg(30);
        this.setSpeed(10);
        this.setAttackspeed(0.7);
        this.setAlive(true);
    }
}
