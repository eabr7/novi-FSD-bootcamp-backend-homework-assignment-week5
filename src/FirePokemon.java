import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    // Variables:
    String type;
    List<String> attacks = Arrays.asList(/*voer de aanvallen hier in*/);

    // Constructor:
    public FirePokemon(String name, int hp, int level, String food, String sound) {
        super(name, hp, level, food, sound);
    }

    // Getters & Setters:


    // Methods:
    List<String> getAttacks() {
        return attacks;


    }

    void fireLash(Pokemon name, Pokemon enemy);
    void flameThrower(Pokemon name, Pokemon enemy);
    void pyroBall(Pokemon name, Pokemon enemy);
    void inferno(Pokemon name, Pokemon enemy);
}
