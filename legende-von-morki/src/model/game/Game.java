package model.game;

import model.AGameEntity;
import model.allies.AAlly;
import model.allies.soldiers.Archer;
import model.buildings.Tower;
import model.game.interactionExceptions.*;
import model.map.contents.Tile;

public class Game implements IGameEntityInteractions {

    private final GameField FIELD;
    private final Player PLAYER;

    public Game(GameField field, Player player) {
        this.FIELD = field;
        this.PLAYER = player;
    }

    @Override
    public void spawnUnit(AGameEntity a) {
        a.setTile(this.FIELD.getAlliedPath().get(0));
        this.FIELD.getAlliedPath().get(0).enterUnit(a);
    }

    @Override
    public void placeTower(Tile tile) throws InvalidTowerPlacementException {
        if (!(tile.hasTower() || tile.isPath() || tile.isScenery())) {
            tile.setTower(true);
        } else {
            throw new InvalidTowerPlacementException("A tower cannot be placed here!");
        }
    }

    public void spawnUnit(AAlly a, Tower tower) throws WrongUnitTypeException, InvalidUnitPlacementException {
        if (a instanceof Archer && tower.getSoldiers().size() <= 6) {
            tower.addSoldier(a);
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
