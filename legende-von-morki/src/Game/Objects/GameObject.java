package Game.Objects;

public abstract class GameObject {

    private boolean isSpawnable = false;

    public boolean isSpawnable() {
        return isSpawnable;
    }

    public void setSpawnable(boolean spawnable) {
        isSpawnable = spawnable;
    }

}
