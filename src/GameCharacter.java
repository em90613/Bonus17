import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ericm on 7/17/2017.
 */
public class GameCharacter {
    private String name;
    private int strength;
    private int intelligence;

    public GameCharacter(String name, int strength, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void play(){
        System.out.println(name);
        System.out.println("Strenth: " + strength);
        System.out.println("Intelligence: " + intelligence);

    }
}
