import java.io.Serializable;

abstract class Character implements Serializable {
    protected String name;
    protected int strength;
    protected int agility;
    protected int intelligence;

    public Character(String name, int strength, int agility, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public abstract String attack();

    @Override
    public String toString() {
        return "Name: " + name + ", Strength: " + strength + ", Agility: " + agility + ", Intelligence: " + intelligence;
    }
}