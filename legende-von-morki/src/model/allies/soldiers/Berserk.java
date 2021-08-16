package model.allies.soldiers;

import model.allies.Ally;

public class Berserk extends Ally {

    //100, 30, 0, 1, 25, 0, false
    public Berserk() {
        super(100, 30, 0, 1, 25, 0, false);
    }

    /**
     * If an enemy is in ultimate vicinity of the turret the berserk is deployed on,
     * he jumps off the turret and start dealing damage on cost of 3 health per hit,
     * but amplified by 250% and has a higher attackspeed of 200%.
     */
    public void rage() {
        //TODO turret position has a enemy one tile around it
        setSpeed(1);
        //TODO deal 3 damage per hit
        setDmg((int) (this.getDmg() * 2.5));
        setAttackspeed(this.getAttackspeed() * 2);
    }
}
