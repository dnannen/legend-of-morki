package Game.Objects.Friendlies;

import Game.Objects.Enemies.EnemyUnit;
import Game.Objects.IActiveGameObject;

public class FriendlyUnit implements IActiveGameObject {

    private Integer health;
    private Integer attack;
    private Integer speed;

    public FriendlyUnit(int h, int a) {
        this.health = h;
        this.attack = a;
    }

    @Override
    public void attack(IActiveGameObject target) {
        if (target instanceof EnemyUnit) {
            target.setHealth(target.getHealth() - this.attack);
        }
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int h) {
        this.health = h;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public void setAttack(int a) {
        this.attack = a;
    }
}
