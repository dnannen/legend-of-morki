package model;

import model.map.contents.Tile;

import java.util.List;

public interface IGameUnitAttributes {

    int getHp();

    void setHp(int hp);

    int getDmg();

    void setDmg(int dmg);

    List<Tile> getRange();

    void setRange(List<Tile> newRange);

    double getSpeed();

    void setSpeed(double speed);

    double getAttackSpeed();

    void setAttackSpeed(double attackSpeed);

    int getArmour();

    void setArmour(int armor);

    boolean isAoe();

    void setAoe(boolean aoe);

    Tile getTile();

    void setTile(Tile tile);

}