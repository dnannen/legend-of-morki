package model.allies.soldiers;

import model.allies.Ally;

public class Catapult extends Ally {

    public Catapult() {
        super(144, 25, 0, 0.2, 5, 0, true);
    }

    //TODO implement passive ability, if this unit has an engineer maintaining it, some values will be buffed (like attackspeed)
}
