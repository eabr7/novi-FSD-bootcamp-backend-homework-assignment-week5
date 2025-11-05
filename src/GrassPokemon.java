import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    // Variables:
    String type;
    List<String> attacks = Arrays.asList(/*voer de aanvallen hier in*/);

    // Constructor:
    public GrassPokemon(String name, int hp, int level, String food, String sound) {
        super(name, hp, level, food, sound);
    }


    // Getters & Setters:


    // Methods:
    List<String> getAttacks() {
        return attacks;


    }

    public void solarBeam(Pokemon name, Pokemon enemy);
    public void leafStorm(Pokemon name, Pokemon enemy);
    public void leechSeed(Pokemon name, Pokemon enemy);
    public void leaveBlade(Pokemon name, Pokemon enemy);
}
