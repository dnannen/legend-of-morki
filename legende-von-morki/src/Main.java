import model.allies.soldiers.Archer;
import model.allies.soldiers.ManAtArms;
import model.buildings.Tower;
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

        /*Map map = new Map(10, 10);
        List<Tile> surrounds = map.getTile(1, 10).getSurroundingTiles(map);

        for (Tile tile : surrounds) {
            System.out.println(tile.getID());
            System.out.println(tile.getCoordinates());
        }*/

        GameField field = new GameField(10, 10);
        Player jan = new Player();
        Game game = new Game(field, jan);

        //game.placeTower(field.getTile(9, 9)); Exception triggers!
        //game.placeTower(field.getTile(1, 5)); Exception triggers!
        game.placeTower(field.getTile(1, 6));
        game.spawnUnit(new ManAtArms());
        //TODO spawning will later be changed
        //game.spawnUnit(new ManAtArms(), new Tower(field.getTile(1, 6))); Exception triggers!
        game.spawnUnit(new Archer(), new Tower(field.getTile(1, 6)));

        System.out.println(field.getTile(1, 5).getCurrentUnitsOnTile()); // []
        System.out.println(field.getTile(1, 5).getTower()); // null
        System.out.println(field.getTile(1, 6).getTower()); //model.buildings.Tower@723279cf
        System.out.println(field.getTile(1, 6).getTower().getSoldiers()); //[] TODO this one doesnt work yet
    }
}
