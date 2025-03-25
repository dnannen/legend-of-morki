package City;

import Profile.Player;

public class CityBoard {

    private final City city;

    public CityBoard(Player player) {
        city = new City(player);

        //each time the city is loaded, execute the buildings function one time
        for (int i = 0; i < city.getBuildings().size(); i++) {
            city.getBuildings().get(i).passive();
        }
    }
}
