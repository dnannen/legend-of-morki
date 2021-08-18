package model.allies.soldiers;

import model.allies.AAlly;
import model.enemies.AEmeny;
import model.map.Tile;

public class Berserk extends AAlly {
    private boolean rage = false;
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
        rage = true;
        setDmg((int) (this.getDmg() * 2.5));
        setAttackspeed(this.getAttackspeed() * 2);
    }

    @Override
    public void attack(AEmeny target) {
        if( rage == true ){
            super.attack(target);
            this.setHp(this.getHp() - 3);
        } else {
            super.attack(target);
        }
    }
}
