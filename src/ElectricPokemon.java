import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    // Variables:
    String type;
    List<String> attacks = Arrays.asList(/*voer de aanvallen hier in*/);

    // Constructor:


    // Getters & Setters:


    // Methods:
    List<String> getAttacks() {
        return attacks;


    }

    void thunderPunch(Pokemon name, Pokemon enemy);
    void electroBall(Pokemon name, Pokemon enemy);
    public void solarBeam(Pokemon name, Pokemon enemy);
    void thunder(Pokemon name, Pokemon enemy);
    void voltTackle(Pokemon name, Pokemon enemy);

}
