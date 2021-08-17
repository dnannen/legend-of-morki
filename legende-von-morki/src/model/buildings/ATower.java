package model.buildings;

import model.AGameEntity;
import model.allies.AAlly;
import model.allies.siegeweapons.ASiegeWeapon;
import model.allies.soldiers.Engineer;
import model.map.Tile;

import java.util.ArrayList;

public abstract class ATower implements IActiveBuilding {

    private Tile tile;

    private final int MAX_SOLDIERS = 6;
    private final int MAX_SIEGE_WEAPONS = 2;

    private int hp;
    private boolean maintained;
    private int level;
    private ArrayList<AGameEntity> soldiers;
    private ArrayList<AGameEntity> siegeWeapons;

    public ATower(Tile tile) {
        this.tile = tile;
        this.level = 1;
        this.hp = 300;
        this.maintained = false;
    }

    @Override
    public int getHP() {
        return this.hp;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setHP(int hp) {
        this.hp = hp;
    }

    @Override
    public void setMaintained(boolean maintained) {
        this.maintained = maintained;
    }

    @Override
    public  void LevelUp(int level) {
        this.level++;
    }

    @Override
    public void destroy() {
        this.tile = null;
    }

    public void addSoldier(AAlly soldier) {
        if (soldiers.size() < MAX_SOLDIERS) {
            this.soldiers.add(soldier);
            if (!this.maintained && soldier instanceof Engineer) {
                this.maintained = true;
            }
        }
    }

    public void killSoldier(AAlly soldier) {
        this.soldiers.remove(soldier);
    }

    public void addSiegeWeapon(ASiegeWeapon sw) {
        if (this.siegeWeapons.size() < MAX_SIEGE_WEAPONS) {
            this.siegeWeapons.add(sw);
        }
    }

    //TODO assuming the foremost weapon gets destroyed
    public void destroySiegeWeapon() {
        this.siegeWeapons.remove(this.siegeWeapons.size() - 1);
    }
}
