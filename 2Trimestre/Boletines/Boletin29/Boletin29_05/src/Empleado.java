import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private int id;
    private String departamento;

    public Empleado(String nombre, int id, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}