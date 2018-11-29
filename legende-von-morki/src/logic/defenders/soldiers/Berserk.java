package logic.defenders.soldiers;

import logic.AGameEntity;
import logic.field.IGameField;

public class Berserk extends AGameEntity {

    /**
     * Creates a new instance of a Berserk
     */
    Berserk(IGameField gamefield) {
        this.setHp(100);
        this.setDmg(30);
        this.setSpeed(0);
        this.setAttackspeed(0.3);
        this.setAlive(true);
    }

    /**
     * If an enemy is in ultimate vicinity of the turret the berserk is deployed on,
     * he jumps off the turret and start dealing damage on cost of 3 health per hit,
     * but amplified by 250% and has a higher attackspeed of 200%.
     */
    public void rage() {
        //TODO later, after new algorithm is finished
    }
}
