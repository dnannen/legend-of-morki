package model.game;

import model.AGameEntity;
import model.allies.AAlly;
import model.buildings.AActiveBuilding;
import model.enemies.AEnemy;
import model.map.Map;

import java.util.List;

public class GameField extends Map {

    private final int MAX_TROOPS = 50;

    private List<AAlly> currentUnitsInPlay;
    private List<AEnemy> currentEnemiesInPlay;
    private List<AActiveBuilding> currentTowersOnMap;

    public GameField(int xLength, int yWidth) {
        super(xLength, yWidth);
    }

    public boolean move(AGameEntity a) {
        a.getTile().removeUnit(a);
        for(int i = 0; i < this.getEnemyPath().size(); i++) {
            if (a.getTile().equals(this.getEnemyPath().get(i))) {
                this.getEnemyPath().get(i + 1).enterUnit(a);
                a.setTile(this.getEnemyPath().get(i + 1));
                return true;
            }
        }
        return false;
    }

    public int getMAX_TROOPS() {
        return this.MAX_TROOPS;
    }

    public List<AAlly> getCurrentUnitsInPlay() {
        return this.currentUnitsInPlay;
    }

    public void addAllyToGame(AAlly ally) {
        this.currentUnitsInPlay.add(ally);
    }

    public List<AEnemy> getCurrentEnemiesInPlay() {
        return this.currentEnemiesInPlay;
    }

    public void addEnemyToGame(AEnemy enemy) {
        this.currentEnemiesInPlay.add(enemy);
    }

    public List<AActiveBuilding> getCurrentTowersOnMap() {
        return this.currentTowersOnMap;
    }

    public void addTowerToGame(AActiveBuilding tower) {
        this.currentTowersOnMap.add(tower);
    }
}
