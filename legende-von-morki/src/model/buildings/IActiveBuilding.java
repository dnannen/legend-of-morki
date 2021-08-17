package model.buildings;

import model.map.Tile;

public interface IActiveBuilding {

    int getHP();

    int getLevel();

    void setHP(int hp);

    void setMaintained(boolean maintained);

    void LevelUp(int level);

    void destroy();
}
