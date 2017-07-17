import java.util.ArrayList;

/**
 * Created by ericm on 7/17/2017.
 */
public class PlayGame {
    public static void main(String[] args) {
        //GameCharacter gc1 = new GameCharacter("gary",10,10);
        ArrayList<GameCharacter> gameCharacters = new ArrayList<>();

        gameCharacters.add(new Warrior("Warrior 1",6,8,"Tomahawk"));
        gameCharacters.add(new Warrior("Warrior 2",9,4,"Battle Axe"));
        gameCharacters.add(new Wizard("Wizard 1",7,7,8,8));
        gameCharacters.add(new Wizard("Wizard 2",6,8,7,5));
        gameCharacters.add(new Wizard("Wizard 3",5,9,6,6));

        for (GameCharacter list : gameCharacters) {
            list.play();
            
        }

    }
}
