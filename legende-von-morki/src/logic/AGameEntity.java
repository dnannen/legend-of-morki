package logic;

import logic.field.GameField;
import logic.field.Tile;

public abstract class AGameEntity implements IGameEntity {

    private int hp;
    private int dmg;
    private int speed;
    private double attackspeed;
    private boolean alive;
    private boolean aoe;
    private int armor;
    private int ap;
    private Tile position;
    private GameField field;

    /**
     * Lets the entity die
     */
    public void die() {
        this.alive = false;
    }

    /**
     * @inheritDoc
     */
    public int getHp() {
        return hp;
    }

    /**
     * @inheritDoc
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @inheritDoc
     */
    public int getDmg() {
        return dmg;
    }

    /**
     * @inheritDoc
     */
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    /**
     * @inheritDoc
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @inheritDoc
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @inheritDoc
     */
    public double getAttackspeed() {
        return attackspeed;
    }

    /**
     * @inheritDoc
     */
    public void setAttackspeed(double attackspeed) {
        this.attackspeed = attackspeed;
    }

    /**
     * @inheritDoc
     */
    public int getArmor() {
        return this.armor;
    }

    /**
     * @inheritDoc
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    /**
     * @inheritDoc
     */
    public int getAP() {
        return this.ap;
    }

    /**
     * @inheritDoc
     */
    public void setAP(int ap) {
        this.ap = ap;
    }

    /**
     * @inheritDoc
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * @inheritDoc
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     * @inheritDoc
     */
    public boolean isAoe() {
        return this.aoe;
    }

    /**
     * @inheritDoc
     */
    public void setAoe(boolean aoe) {
        this.aoe = aoe;
    }

    /**
     * @inheritDoc
     */
    public Tile getCurrentPos() {
        return this.position;
    }

    /**
     * @inheritDoc
     */
    public void setField(GameField gamefield) {
        this.field = gamefield;
    }

    /**
     * @inheritDoc
     */
    public GameField getField() {
        return this.field;
    }

    @Override
    public Tile[] getAdjacentTiles(int x, int y) {
        return new Tile[0];
    }

    /**
     * @inheritDoc
     */
    public Tile[] getAdjacentTiles() {
        //Copy coordinates
        int x = this.getCurrentPos().getxCoord();
        int y = this.getCurrentPos().getyCoord();
        //into this array
        int[] copy = new int[] { y+1, x, y+1, x+1, y, x+1, y-1, x+1, y-1, x, y-1, x-1, y, x-1, y+1, x-1};
        Tile[] re = new Tile[9];

        for (int i = 0; i < copy.length; i++) {
            //After each y-coord comes a x coord
            if (copy[i] % 2 == 0) {
                for (int j = 0; j < copy.length; j++) {
                    re[j] = this.getField().getTileFromCoords(i, i + 1);
                }
            }
        }
        return re;
    }
}
