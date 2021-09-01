import model.allies.soldiers.Archer;
import model.allies.soldiers.ManAtArms;
import model.buildings.Tower;
import model.enemies.grunts.EvilMage;
import model.enemies.grunts.Tank;
import model.game.Game;
import model.game.GameField;
import model.game.Player;
import model.game.interactionExceptions.InvalidTowerPlacementException;
import model.game.interactionExceptions.InvalidUnitPlacementException;
import model.game.interactionExceptions.WrongUnitTypeException;


public class Main {

    public static void main(String[] args) throws InvalidTowerPlacementException,
                                                  WrongUnitTypeException,
                                                  InvalidUnitPlacementException {

        GameField field = new GameField(10, 10);
        Player jan = new Player();
        Game game = new Game(field, jan);

        System.out.println(field.getPath().get(0).getCoordinates());
        System.out.println(field.getEnemyPath().get(0).getCoordinates());

        //testing spawning units
        ManAtArms man = new ManAtArms();
        game.spawnUnit(man);
        System.out.println(man.getTile().getCoordinates());
        System.out.println(field.getTile(1, 5).getCurrentUnitsOnTile());

        //testing spawning tower
        game.placeTower(field.getTile(1, 6));
        System.out.println(field.getTile(1, 6).getTower());

        //testing spawning units on tower
        Archer archer = new Archer();
        game.spawnUnitOnTower(field.getTile(1, 6), archer);
        System.out.println(field.getTile(1, 6).getTower().getSoldiers());
        System.out.println(field.getTile(1, 6).getCurrentUnitsOnTile()); //TODO maybe change this?
    }

}