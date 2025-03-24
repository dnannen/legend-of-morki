package Game.Objects;

public interface ActiveGameObject {

    void attack(ActiveGameObject target);

    int getHealth();
    void setHealth(int h);

    int getAttack();
    void setAttack(int a);

}
