import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    // Variables:
    private final String colorElectricity = "white";
    private final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "Volt Tackle");

    // Constructor:
    public ElectricPokemon(String name, int hp, int level, String food, String sound) {
        super(name, hp, level, food, sound);
    }

    // Getters:
    public String getColorElectricity() {
        return colorElectricity;
    }

    public List<String> getAttacks() {
        return attacks;
    }

// Methods:
    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Thunder Punch on" + enemy);
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Electro Ball on" + enemy);
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Thunder on" + enemy);
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Volt Tackle on" + enemy);
    }
}

