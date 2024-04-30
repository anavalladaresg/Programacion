class Warrior extends Character {
    public Warrior(String name, int strength, int agility, int intelligence) {
        super(name, strength, agility, intelligence);
    }

    @Override
    public String attack() {
        return "Warrior attacks with strength " + strength;
    }
}