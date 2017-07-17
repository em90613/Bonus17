/**
 * Created by ericm on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacter {
    private int spellnumber;

    public int getSpellnumber() {
        return spellnumber;
    }

    public void setSpellnumber(int spellnumber) {
        this.spellnumber = spellnumber;
    }

    public Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellnumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.spellnumber = spellnumber;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Number of spells: " + spellnumber);
        System.out.println();
    }
}
