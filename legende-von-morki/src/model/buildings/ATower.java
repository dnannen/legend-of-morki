package model.buildings;

import model.AGameEntity;
import model.allies.Ally;

import java.util.ArrayList;

public abstract class ATower implements IActiveBuilding {

    private final int MAX_SOLDIERS = 6;
    private final int MAX_SIEGE_WEAPONS = 2;

    private int hp;
    private boolean maintained;
    private ArrayList<AGameEntity> soldiers;
    private ArrayList<AGameEntity> siegeWeapons;

    @Override
    public int getHP() {
        return this.hp;
    }

    @Override
    public void setHP(int hp) {
        this.hp = hp;
    }

    @Override
    public void setMaintained(boolean maintained) {
        this.maintained = maintained;
    }

    public void addSoldier(Ally soldier) {
        if (soldiers.size() < MAX_SOLDIERS) {
            this.soldiers.add(soldier);
        }
    }

    public void killSoldier(Ally soldier) {
        this.soldiers.remove(soldier);
    }

    public void addSiegeWeapon() {
        //TODO, no siege weapons in the game yet
    }

    public void destroySiegeWeapon() {
        //TODO, no siege weapons in the game yet
    }
}
