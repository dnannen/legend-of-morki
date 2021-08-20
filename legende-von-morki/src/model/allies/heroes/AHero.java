package model.allies.heroes;

import model.AGameEntity;
import model.enemies.AEnemy;
import model.map.Tile;
import model.skills.ISkill;

import java.util.List;

public abstract class AHero extends AGameEntity {

    private ISkill[] skills = new ISkill[2];
    private int level = 0;

    public AHero(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe, Tile tile) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackspeed(attackspeed);
        this.setArmour(armour);
        this.setAP(ap);
        this.setAoe(aoe);

        this.setTile(tile);
        tile.enterUnit(this);
    }

    public void setSkills(ISkill[] newSkills) {
        if (newSkills.length == skills.length) {
            skills = newSkills;
        }
    }

    public ISkill getSkill(int index) {
        if (0 <= index && index <= 2) {
            return this.skills[index];
        } else {
            return null;
        }
    }

    public void useSkill(ISkill skill) {
        skill.use();
    }

}
