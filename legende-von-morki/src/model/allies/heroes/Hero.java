package model.allies.heroes;

import model.AGameEntity;
import model.skills.ISkill;

import java.util.ArrayList;

public class Hero extends AGameEntity {

    private ArrayList<ISkill> skills;
    private int level = 0;

    public Hero(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe, ArrayList<ISkill> skills) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackspeed(attackspeed);
        this.setArmour(armour);
        this.setAP(ap);
        this.setAoe(aoe);
        this.skills = skills;
    }

    public ArrayList<ISkill> getSkills() {
        return this.skills;
    }

    public void addSkill(ISkill skill) {
        if (skills.size() < 3) {
            skills.add(skill);
        }
    }

    public void removeSkill(ISkill skill) {
        this.skills.remove(skill);
    }

    public void useSkill(ISkill skill) {
        //TODO
    }

    @Override
    public void die() {

    }

    //TODO methods for leveling
}