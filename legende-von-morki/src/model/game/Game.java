package model.game;

import model.AGameEntity;
import model.allies.AAlly;
import model.allies.soldiers.Archer;
import model.buildings.Tower;
import model.game.interactionExceptions.InvalidUnitPlacementException;
import model.game.interactionExceptions.WrongUnitTypeException;

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
    }

    public void spawnUnit(AAlly a, Tower tower) throws WrongUnitTypeException, InvalidUnitPlacementException {
        if (a instanceof Archer && tower.getSoldiers().size() <= 6) {
            tower.addSoldier(a);
        } else if (!(a instanceof Archer)) {
            throw new WrongUnitTypeException("Only archers can be placed on towers!");
        } else {
            throw new InvalidUnitPlacementException("This unit cannot be placed here!");
        }
    }

    @Override
    public void resolveFight(AGameEntity attacker, AGameEntity target) {
        target.setHp(target.getHp() - (attacker.getDmg() - target.getArmour()));
        if (target.getHp() <= 0) target.die();
    }

    @Override
    public boolean move(AGameEntity a) {
        a.getTile().removeUnit(a);
        for(int i = 0; i < this.FIELD.getAlliedPath().size(); i++) {
            if (a.getTile().equals(this.FIELD.getAlliedPath().get(i))) {
                this.FIELD.getAlliedPath().get(i + 1).enterUnit(a);
                a.setTile(this.FIELD.getAlliedPath().get(i + 1));
                return true;
            }
        }
        return false;
    }
}
