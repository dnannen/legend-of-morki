package City.Buildings;

public interface ICityBuilding {

    int getLevel();
    void levelUp();

    //The function of the building i.e. income or buffs
    int passive();
}
