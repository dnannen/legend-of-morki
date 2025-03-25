package City.Buildings;

public class MainBuilding implements ICityBuilding {

    private Integer level = 1;

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void levelUp() {
        level+=1;
    }

    @Override
    public int passive() {
        switch (this.level) {
            case 1:
                return 25;
            case 2:
                return 35;
            case 3:
                return 50;
            default:
                if (this.level > 0) {
                    return 0;
                }
            return 0;
        }
    }
}
