package model;

public interface GameEntityAttributes {

    int getHp();

    void setHp(int hp);

    int getDmg();

    void setDmg(int dmg);

    int getSpeed();

    void setSpeed(int speed);

    double getAttackspeed();

    void setAttackspeed(double attackspeed);

    int getArmour();

    void setArmour(int armor);

    int getAP();

    void setAP(int AP);

    boolean isAoe();

    void setAoe(boolean aoe);

    //TODO Position, Field, adjacency

}
