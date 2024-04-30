class Mage extends Character {
    public Mage(String name, int strength, int agility, int intelligence) {
        super(name, strength, agility, intelligence);
    }

    @Override
    public String attack() {
        return "Mage attacks with magic power " + intelligence;
    }
}