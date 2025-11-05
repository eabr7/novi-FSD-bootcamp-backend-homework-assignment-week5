import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    // Variables:
   private final String colorFlame = "red";
   private final List<String> attacks = Arrays.asList("Fire Lash", "Flame Thrower", "Pyroball", "Inferno");

    // Constructor:
    public FirePokemon(String name, int hp, int level, String food, String sound) {
        super(name, hp, level, food, sound);
    }

    // Getters:
    public String getColorFlame() {
        return colorFlame;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name + "uses Fire Lash on" + enemy);
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Flame Thrower on" + enemy);
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Pyroball on" + enemy);
    }
    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name + "uses Inferno on" + enemy);
    }
}

