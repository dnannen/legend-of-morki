package model.allies.heroes;

import model.skills.ISkill;

import java.util.ArrayList;

public class Morki extends Hero {

    public Morki(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe, ArrayList<ISkill> skills) {
        super(hp, dmg, speed, attackspeed, armour, ap, aoe, skills);
    }
}
