package Game.Objects.Friendlies;

import Game.Objects.GameObject;

public class FriendlyUnit extends GameObject {

    private Integer health;
    private Integer attack;

    public FriendlyUnit(int h, int a) {
        this.health = h;
        this.attack = a;
    }
}
