package model;

import model.map.Tile;

public interface IGameUnitAttributes {

    int getHp();

    void setHp(int hp);

    int getDmg();

    void setDmg(int dmg);

    float getSpeed();

    void setSpeed(float speed);

    double getAttackspeed();

    void setAttackspeed(double attackspeed);

    int getArmour();

    void setArmour(int armor);

    int getAP();

    void setAP(int AP);

    boolean isAoe();

    void setAoe(boolean aoe);

    Tile getTile();

    void addTo(Tile tile);

}
