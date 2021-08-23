package model;

import model.map.Tile;

public interface IGameUnitAttributes {

    int getHp();

    void setHp(int hp);

    int getDmg();

    void setDmg(int dmg);

    double getSpeed();

    void setSpeed(double speed);

    double getAttackSpeed();

    void setAttackSpeed(double attackSpeed);

    int getArmour();

    void setArmour(int armor);

    int getAP();

    void setAP(int AP);

    boolean isAoe();

    void setAoe(boolean aoe);

    Tile getTile();

    void setTile(Tile tile);

}
