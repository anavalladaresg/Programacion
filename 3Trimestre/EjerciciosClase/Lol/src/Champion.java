/**
 * Clase para representar un campeón en el simulador de League of Legends.
 */
public class Champion {
    private String name; // Nombre del campeón
    private int health; // Salud del campeón
    private int attackDamage; // Daño de ataque del campeón
    private String role; // Rol del campeón

    /**
     * Constructor para la clase Champion.
     *
     * @param name         Nombre del campeón.
     * @param health       Salud del campeón.
     * @param attackDamage Daño de ataque del campeón.
     */
    public Champion(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    /**
     * Método getter para el nombre del campeón.
     *
     * @return El nombre del campeón.
     */
    public String getName() {
        return name;
    }

    /**
     * Método setter para el nombre del campeón.
     *
     * @param name El nuevo nombre del campeón.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método getter para la salud del campeón.
     *
     * @return La salud del campeón.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Método setter para la salud del campeón.
     *
     * @param health La nueva salud del campeón.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Método getter para el daño de ataque del campeón.
     *
     * @return El daño de ataque del campeón.
     */
    public int getAttackDamage() {
        return attackDamage;
    }

    /**
     * Método setter para el daño de ataque del campeón.
     *
     * @param attackDamage El nuevo daño de ataque del campeón.
     */
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    /**
     * Método getter para el rol del campeón.
     *
     * @return El rol del campeón.
     */
    public String getRole() {
        return role;
    }

    /**
     * Método setter para el rol del campeón.
     *
     * @param role El nuevo rol del campeón.
     */
    public void setRole(String role) {
        this.role = role;
    }
}