import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    // Variables:
    private final int amountLeaves = 50;
    private final List<String> attacks = Arrays.asList("Solar Beam", "Leaf Storm", "Leech Seed", "Leave Blade");

    // Constructor:
    public GrassPokemon(String name, int hp, int level, String food, String sound) {
        super(name, hp, level, food, sound);
    }

    // Getters:
    public int getAmountLeaves() {
        return amountLeaves;
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Solar Beam on" + enemy);
    }
    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Leaf Storm on" + enemy);
    }
    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Leech Seed on" + enemy);
    }
    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Leave Blade on" + enemy);
    }
}
