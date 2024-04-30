class Scout extends Character {
    public Scout(String name, int strength, int agility, int intelligence) {
        super(name, strength, agility, intelligence);
    }

    @Override
    public String attack() {
        return "Scout attacks quickly with agility " + agility;
    }
}