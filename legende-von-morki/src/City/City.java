package City;

import City.Buildings.Barracks;
import City.Buildings.ICityBuilding;
import City.Buildings.MainBuilding;
import Profile.Player;

import java.util.List;

public class City {

    private List<ICityBuilding> buildings;
    private Player owner;

    public City(Player p) {
        this.owner = p;

        buildings.add(new MainBuilding());
        buildings.add(new Barracks());
    }

    public void addBuilding(ICityBuilding building) {
        buildings.add(building);
    }

    public List<ICityBuilding> getBuildings() {
        return this.buildings;
    }
}
