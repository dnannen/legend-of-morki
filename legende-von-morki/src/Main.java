import model.allies.soldiers.Archer;
import model.map.Map;
import model.map.Tile;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Map map = new Map(10, 10);
        Archer archer = new Archer(map.getTile(5, 5));

        System.out.print(map.getTile(5, 5).getCurrentUnitsOnTile());
        //TODO doesnt work, probably mismatch between indices

    }
}
