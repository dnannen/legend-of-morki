package model.allies.soldiers;

import model.allies.AAlly;
import model.map.Tile;

public class Berserk extends AAlly {

    public Berserk(Tile tile) {
        super(100, 30, 0, 1, 25, 0, false, tile);
    }

    /*
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
