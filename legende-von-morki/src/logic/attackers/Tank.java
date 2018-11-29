package logic.attackers;

import logic.AGameEntity;

public class Tank extends AGameEntity{

    public Tank() {
        this.setHp(100);
        this.setDmg(5);
        this.setSpeed(1);
        this.setAttackspeed(0.5);
        this.setAlive(true);
    }
}
