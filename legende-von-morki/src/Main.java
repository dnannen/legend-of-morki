import model.allies.soldiers.ManAtArms;
import model.game.Game;
import model.game.GameField;
import model.game.Player;
import model.map.Map;
import model.map.Tile;

import java.util.List;


public class Main {

    public static void main(String[] args) {

        /*Map map = new Map(10, 10);
        List<Tile> surrounds = map.getTile(1, 10).getSurroundingTiles(map);

        for (Tile tile : surrounds) {
            System.out.println(tile.getID());
            System.out.println(tile.getCoordinates());
        }*/

        GameField field = new GameField(10, 10);
        Player jan = new Player();
        Game game = new Game(field, jan);

        ManAtArms fighter = new ManAtArms();
        game.spawnUnit(fighter);

        System.out.println(field.getAlliedPath().get(0).getCoordinates());
        System.out.println(fighter.getTile().getCoordinates());
        System.out.println(field.getAlliedPath().get(0).getCurrentUnitsOnTile());
    }
}
