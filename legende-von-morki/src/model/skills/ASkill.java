package model.skills;

import model.allies.heroes.AHero;

public abstract class ASkill implements ISkill {

    private String name;
    private AHero user;
    private double apRatio;
    private double damageRatio;
    private double armourRatio;
    private double attackspeedRatio;
    //maybe more ratios missing

    public ASkill(String name, AHero hero, double apRatio, double damageRatio, double armourRatio, double attackspeedRatio) {
        this.user = hero;
        this.name = name;
        this.apRatio = apRatio;
        this.damageRatio = damageRatio;
        this.armourRatio = armourRatio;
        this.attackspeedRatio = attackspeedRatio;
    }
}
