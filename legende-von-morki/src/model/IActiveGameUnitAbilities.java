package model;

public interface IActiveGameUnitAbilities {

    void die();

    void attack(AGameEntity target);

    boolean checkForFoesInRange();

}
