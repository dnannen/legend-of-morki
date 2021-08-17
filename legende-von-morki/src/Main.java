import model.allies.soldiers.Archer;
import model.map.Map;
import model.map.Tile;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Map map = new Map(10, 10);
        Archer archer = new Archer(map.getPath().get(map.getPath().size() - 1));

        System.out.print(map.getTile(
                         map.getPath().get(map.getPath().size() - 1).getCoordinates().get(0),
                         map.getPath().get(map.getPath().size() - 1).getCoordinates().get(1)
                ).getCurrentUnitsOnTile()
        );
        //TODO doesnt work, probably mismatch between indices

    }
}
