public abstract class Pokemon {
   // variables:
    private final String name;
    private final int hp;
    private final int level;
    private final String food;
    private final String sound;
    private String type;

    // constructor:
    public Pokemon(String name, int hp, int level, String food, String sound) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.food = food;
        this.sound = sound;
    }

    // getters & setter:
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

