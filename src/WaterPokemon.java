import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    // Variables:
    private final String waterState = "water";
   private final List<String> attacks = Arrays.asList("Surf", "Hydropump", "Hydrocanon", "Rain Dance");

    // Constructor:
    public WaterPokemon(String name, int hp, int level, String food, String sound) {
        super(name, hp, level, food, sound);
    }

    // Getters & Setters:
    public String getWaterState() {
        return waterState;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    // Methods:
    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Surf on" + enemy);
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Hydropump on" + enemy);
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Hydrocanon on" + enemy);
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Rain Dance on" + enemy);
    }
}