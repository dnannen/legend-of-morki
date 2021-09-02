package model.buildings;

import model.allies.AAlly;
import model.allies.siegeweapons.ASiegeWeapon;
import model.allies.soldiers.Engineer;
import model.map.Tile;

import java.util.ArrayList;

public abstract class AActiveBuilding implements IActiveBuilding {

    private final int MAX_SOLDIERS = 6;
    private final int MAX_SIEGE_WEAPONS = 2;

    private int hp;
    private boolean maintained;
    private int level;
    private Tile tile; //TODO work with the tile;

    private ArrayList<AAlly> soldiers = new ArrayList<>(MAX_SOLDIERS);
    private ArrayList<ASiegeWeapon> siegeWeapons = new ArrayList<>(MAX_SIEGE_WEAPONS);

    @Override
    public int getHP() {
        return this.hp;
    }

    @Override
    public void setHP(int hp) {
        this.hp = hp;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public boolean getMaintained() {
        return this.maintained;
    }

    @Override
    public void setMaintained(boolean maintained) {
        this.maintained = maintained;
    }

    @Override
    public ArrayList<AAlly> getSoldiers() {
        return this.soldiers;
    }

    @Override
    public ArrayList<ASiegeWeapon> getSiegeWeapons() {
        return this.siegeWeapons;
    }

    @Override
    public void levelUp() {
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

    public void destroySiegeWeapon(ASiegeWeapon sw) {
        this.siegeWeapons.remove(sw);
    }
}
