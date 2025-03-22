package Game.Objects.Enemies;

import Game.Objects.GameObject;

public class EnemyUnit extends GameObject {

    private Integer health;
    private Integer attack;

    public EnemyUnit(int h, int a) {
        this.health = h;
        this.attack = a;
    }
}
