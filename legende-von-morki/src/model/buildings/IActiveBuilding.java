package model.buildings;

import model.allies.AAlly;
import model.allies.siegeweapons.ASiegeWeapon;

import java.util.ArrayList;

public interface IActiveBuilding {

    int getHP();

    void setHP(int hp);

    int getLevel();

    boolean getMaintained();

    void setMaintained(boolean maintained);

    ArrayList<AAlly> getSoldiers();

    ArrayList<ASiegeWeapon> getSiegeWeapons();

    void levelUp();

    void destroy();
}
