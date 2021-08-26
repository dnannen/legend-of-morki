package model;

import model.enemies.AEnemy;
import model.map.Tile;

import java.util.List;

public interface IActiveGameUnitAbilities {

    void die();

    void attack(AGameEntity target);

    boolean checkForFoesInRange();

}
