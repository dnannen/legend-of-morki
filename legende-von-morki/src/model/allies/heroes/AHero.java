package model.allies.heroes;

import model.AGameEntity;
import model.skills.ISkill;

public abstract class AHero extends AGameEntity {

    private ISkill[] skills = new ISkill[2];
    private int ap;
    private int level = 0;

    public AHero(int hp, int dmg, double speed, double attackspeed, int armour, int ap, boolean aoe) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackSpeed(attackspeed);
        this.setArmour(armour);
        this.setAP(ap);
        this.setAoe(aoe);
    }

    public int getAP() {
        return this.ap;
    }

    public void setAP(int newAP) {
        this.ap = newAP;
    }

    public int getLevel() {
        return this.level;
    }

    public void levelUp() {
        this.level++;
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