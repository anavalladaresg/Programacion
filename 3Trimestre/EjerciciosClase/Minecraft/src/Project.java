import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase representa un Proyecto que es serializable.
 * Cada proyecto tiene un nombre y una lista de materiales necesarios.
 */
public class Project implements Serializable {
    // El nombre del proyecto
    private String name;
    // Un mapa para almacenar los materiales necesarios para el proyecto y sus cantidades
    private Map<String, Integer> materialsNeeded;

    /**
     * Constructor para la clase Proyecto.
     *
     * @param name El nombre del proyecto
     */
    public Project(String name) {
        this.name = name;
        this.materialsNeeded = new HashMap<>();
    }

    /**
     * Este método se utiliza para agregar un material y su cantidad al proyecto.
     *
     * @param material El nombre del material
     * @param quantity La cantidad del material
     */
    public void addMaterial(String material, int quantity) {
        materialsNeeded.put(material, quantity);
    }

    /**
     * Este método se utiliza para obtener el nombre del proyecto.
     *
     * @return String Esto devuelve el nombre del proyecto.
     */
    public String getName() {
        return name;
    }

    /**
     * Este método se utiliza para obtener los materiales necesarios para el proyecto.
     *
     * @return Map Esto devuelve un mapa de los materiales necesarios y sus cantidades.
     */
    public Map<String, Integer> getMaterialsNeeded() {
        return materialsNeeded;
    }
}