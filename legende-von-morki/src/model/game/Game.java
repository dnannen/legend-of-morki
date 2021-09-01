package model.game;

import model.AGameEntity;
import model.allies.AAlly;
import model.allies.soldiers.Archer;
import model.game.interactionExceptions.*;
import model.map.Tile;

public class Game implements IGameEntityInteractions {

    private final GameField FIELD;
    private final Player PLAYER;

    public Game(GameField field, Player player) {
        this.FIELD = field;
        this.PLAYER = player;
    }

    @Override
    public void spawnUnit(AGameEntity a) {
        a.setTile(this.FIELD.getPath().get(0));
        this.FIELD.getPath().get(0).enterUnit(a);
    }

    @Override
    public void placeTower(Tile tile) throws InvalidTowerPlacementException {
        if (!(tile.hasTower() || tile.isPath() || tile.isScenery())) {
            tile.setTower();
        } else {
            throw new InvalidTowerPlacementException("A tower cannot be placed here!");
        }
    }

    public void spawnUnitOnTower(Tile tile, AAlly a) throws WrongUnitTypeException, InvalidUnitPlacementException {
        if (a.getSpeed() == 0 && tile.hasTower() && tile.getTower().getSoldiers().size() <= 6) {
            tile.getTower().addSoldier(a);
        } else if (!(a instanceof Archer)) {
            throw new WrongUnitTypeException("Only ranged soldiers can be placed on towers!");
        } else {
            throw new InvalidUnitPlacementException("This unit cannot be placed here!");
        }
    }

    @Override
    public void resolveFight(AGameEntity attacker, AGameEntity target) {
        if (attacker.isAoe()) {
            target.getTile().dealAoeDamage(attacker.getDmg());
        } else {
            attacker.attack(target);
        }
        if (target.getHp() <= 0) target.die();
    }

}
