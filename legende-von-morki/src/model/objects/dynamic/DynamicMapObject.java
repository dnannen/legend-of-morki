package model.objects.dynamic;

import model.map.Tile;
import model.objects.AMapObject;

/**
 * Walking units like soldiers and enemies
 */
public class DynamicMapObject extends AMapObject {

    private String type;

    private int hp;
    private int dmg;
    private double speed;
    private double attackSpeed;
    private int armour;
    private int ap;
    private boolean aoe;

    /**
     * Get the hardcoded values for the given unit type.
     * @param type Has to be a valid string. If an unvalid unit is spawned, set its hp to 0.
     */
    public DynamicMapObject(String type) {
        this.type = type;

        switch(type) {
            //Heroes
            case "Morki":
                this.hp          = 200;
                this.dmg         = 75;
                this.speed       = 0.5;
                this.attackSpeed = 0.5;
                this.armour      = 5;
                this.ap          = 5;
                this.aoe         = false;

            //Siege Weapons
            case "Ballista":
                this.hp          = 100;
                this.dmg         = 100;
                this.speed       = 0;
                this.attackSpeed = 0.3;
                this.armour      = 24;
                this.ap          = 0;
                this.aoe         = false;

            case "Catapult":
                this.hp          = 100;
                this.dmg         = 80;
                this.speed       = 0;
                this.attackSpeed = 0.2;
                this.armour      = 5;
                this.ap          = 0;
                this.aoe         = false;

            case "Trebuchet":
                this.hp          = 200;
                this.dmg         = 144;
                this.speed       = 0;
                this.attackSpeed = 0.05;
                this.armour      = 15;
                this.ap          = 0;
                this.aoe         = true;

            //Soldiers
            case "Archer":
                this.hp          = 20;
                this.dmg         = 3;
                this.speed       = 0;
                this.attackSpeed = 0.5;
                this.armour      = 2;
                this.ap          = 0;
                this.aoe         = false;

            case "Engineer":
                this.hp          = 15;
                this.dmg         = 5;
                this.speed       = 0;
                this.attackSpeed = 1.25;
                this.armour      = 10;
                this.ap          = 0;
                this.aoe         = false;

            case "Man at Arms":
                this.hp          = 50;
                this.dmg         = 25;
                this.speed       = 0.6;
                this.attackSpeed = 0.5;
                this.armour      = 20;
                this.ap          = 0;
                this.aoe         = false;

            case "Knight":
                this.hp          = 75;
                this.dmg         = 35;
                this.speed       = 1;
                this.attackSpeed = 0.4;
                this.armour      = 30;
                this.ap          = 0;
                this.aoe         = false;

            //Commanders
            case "Berserk":
                this.hp          = 100;
                this.dmg         = 30;
                this.speed       = 0;
                this.attackSpeed = 1;
                this.armour      = 5;
                this.ap          = 0;
                this.aoe         = false;

            case "Paladin":
                this.hp          = 70;
                this.dmg         = 25;
                this.speed       = 2;
                this.attackSpeed = 0.3;
                this.armour      = 30;
                this.ap          = 40;
                this.aoe         = false;

            //Enemies
            case "Evil Mage":
                this.hp          = 45;
                this.dmg         = 15;
                this.speed       = 0.5;
                this.attackSpeed = 0.75;
                this.armour      = 25;
                this.ap          = 0;
                this.aoe         = true;

            case "Sprinter":
                this.hp          = 10;
                this.dmg         = 30;
                this.speed       = 10;
                this.attackSpeed = 0.7;
                this.armour      = 0;
                this.ap          = 0;
                this.aoe         = false;

            case "Tank":
                this.hp          = 100;
                this.dmg         = 3;
                this.speed       = 1;
                this.attackSpeed = 0.5;
                this.armour      = 25;
                this.ap          = 0;
                this.aoe         = false;

            default :
                this.hp = 0;
        }
    }


    /**
     * Dynamic objects are always placed on the path.
     * @param position spawn location
     */
    @Override
    public void place(Tile position) {
        if (position.isPath()) {
            position.addObject(this);
        }
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public boolean isAoe() {
        return aoe;
    }

    public void setAoe(boolean aoe) {
        this.aoe = aoe;
    }
}
