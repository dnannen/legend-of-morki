package model;

import model.enemies.AEmeny;
import model.map.Tile;

import java.util.List;

public interface IActiveGameUnitAbilities {

    void die();

    void move(List<Tile> path);

    void attack(AEmeny target);

}
