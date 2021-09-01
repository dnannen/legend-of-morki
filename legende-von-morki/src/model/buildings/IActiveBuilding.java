package model.buildings;

import model.allies.AAlly;
import model.allies.siegeweapons.ASiegeWeapon;

import java.util.ArrayList;

public interface IActiveBuilding {

    int getHP();

    int getLevel();

    void setHP(int hp);

    boolean getMaintained();

    ArrayList<AAlly> getSoldiers();

    ArrayList<ASiegeWeapon> getSiegeWeapons();

    void levelUp(int level);

    void destroy();
}
