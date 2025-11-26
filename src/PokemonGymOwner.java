import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    // Variable:
    private String town;

    // constructor:
    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(name, pokemons);
        this.town = town;
    }

    // getters & setters:
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
