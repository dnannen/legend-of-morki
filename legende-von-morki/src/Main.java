import model.allies.soldiers.Archer;
import model.map.Map;


public class Main {

    public static void main(String[] args) {
        Map map = new Map(10, 10);

        Archer archer = new Archer(map.getTile(5, 5));

        System.out.println(map.getTile(5, 5).getCurrentUnitsOnTile());

        System.out.println(map.getTile(1, 5).isPath());
        map.getTile(1, 5).placeTower();
        map.getTile(1, 5).getTower().addSoldier(archer);

        System.out.println(map.getTile(1, 5).isPath());
        System.out.println(map.getTile(1, 5).isScenery());
        System.out.println(map.getTile(1, 5).getTower());
        System.out.print(map.getTile(1, 5).getTower().getSoldiers());

    }
}
