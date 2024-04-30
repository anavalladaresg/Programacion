import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un ProjectManager que es responsable de gestionar múltiples proyectos.
 * Proporciona funcionalidades para agregar un proyecto, obtener todos los proyectos, guardar y cargar proyectos desde un archivo.
 */
public class ProjectManager {
    // Una lista para almacenar todos los proyectos
    private List<Project> projects;
    // El nombre del archivo donde se guardan los proyectos
    private String fileName = "projects.dat";

    /**
     * Constructor para la clase ProjectManager.
     * Inicializa la lista de proyectos.
     */
    public ProjectManager() {
        projects = new ArrayList<>();
    }

    /**
     * Este método se utiliza para agregar un proyecto a la lista.
     *
     * @param project El proyecto a añadir
     */
    public void addProject(Project project) {
        projects.add(project);
    }

    /**
     * Este método se utiliza para obtener todos los proyectos.
     *
     * @return List Esto devuelve una lista de todos los proyectos.
     */
    public List<Project> getProjects() {
        return projects;
    }

    /**
     * Este método se utiliza para guardar todos los proyectos en un archivo.
     * Utiliza ObjectOutputStream para escribir la lista de proyectos en un archivo.
     */
    public void saveProjects() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(projects);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Este método se utiliza para cargar todos los proyectos desde un archivo.
     * Utiliza ObjectInputStream para leer la lista de proyectos desde un archivo.
     */
    public void loadProjects() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            projects = (List<Project>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}