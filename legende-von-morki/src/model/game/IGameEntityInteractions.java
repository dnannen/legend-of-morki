package model.game;

import model.AGameEntity;
import model.allies.AAlly;
import model.buildings.Tower;
import model.game.interactionExceptions.InvalidTowerPlacementException;
import model.game.interactionExceptions.InvalidUnitPlacementException;
import model.game.interactionExceptions.WrongUnitTypeException;
import model.map.Tile;

public interface IGameEntityInteractions {

    void spawnUnit(AGameEntity a);

    void spawnUnit(AAlly a, Tower tower) throws WrongUnitTypeException, InvalidUnitPlacementException;

    void placeTower(Tile tile) throws InvalidTowerPlacementException;

    void resolveFight(AGameEntity attacker, AGameEntity target);

}
