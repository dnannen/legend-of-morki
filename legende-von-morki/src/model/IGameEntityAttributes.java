package model;

public interface IGameEntityAttributes {

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

    //TODO Position, Field, adjacency

}
