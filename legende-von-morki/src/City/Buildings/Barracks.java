package City.Buildings;

import Game.Objects.Friendlies.FriendlyUnit;

import java.util.ArrayList;
import java.util.List;

public class Barracks implements ICityBuilding {

    private Integer level;

    private List<FriendlyUnit> trainedUnits = new ArrayList<FriendlyUnit>();

    public Barracks() {
        level = 1;
        //trainedUnits.add(ManAtArms);
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void levelUp() {
        level+=1;
        this.passive();
    }

    @Override
    public int passive() {
        switch(this.getLevel()){
            //case 1 is omitted because the level 1 units get added in the constructor
            case 2:
                //trainedUnits.add(...);
        }
        return 0;
    }
}
