package model;

import model.enemies.Enemy;
import model.map.Tile;

import java.util.List;

public interface IActiveGameEntityAbilities {

    void die();

    void move(List<Tile> path);

    void attack(Enemy target);

    Tile getTile();

    void addTo(Tile tile);
}
