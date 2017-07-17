/**
 * Created by ericm on 7/17/2017.
 */
public class Warrior extends GameCharacter {
    private String weaponType;

    public Warrior(String name, int strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Weapon: " + weaponType);
        System.out.println();
    }
}
