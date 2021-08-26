package model.game;

import model.AGameEntity;
import model.allies.AAlly;
import model.buildings.Tower;
import model.game.interactionExceptions.InvalidUnitPlacementException;
import model.game.interactionExceptions.WrongUnitTypeException;

public interface IGameEntityInteractions {

    void spawnUnit(AGameEntity a);

    void resolveFight(AGameEntity attacker, AGameEntity target);

}
