package Game.Objects;

public interface IActiveGameObject {

    void attack(IActiveGameObject target);

    int getHealth();
    void setHealth(int h);

    int getAttack();
    void setAttack(int a);

}
