import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    // Variables:
    String type;
    List<String> attacks = Arrays.asList(/*voer de aanvallen hier in*/);

    // Constructor:
    public WaterPokemon(String name, int hp, int level, String food, String sound) {
        super(name, hp, level, food, sound);
    }

    // Getters & Setters:


    // Methods:
    List<String> getAttacks() {
        return attacks;


    }

    void surf(Pokemon name, Pokemon enemy);
    void hydroPump(Pokemon name, Pokemon enemy);
    void hydroCanon(Pokemon name, Pokemon enemy);
    void rainDance(Pokemon name, Pokemon enemy);
}
