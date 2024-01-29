public class Datos {
    private String nombre;
    private int edad;
    private String otro;
    static Datos miDatoUnico = new Datos("Alumno", 18, "unico");

    private Datos(String nombre, int edad, String otro) {
        this.nombre = nombre;
        this.edad = edad;
        this.otro = otro;
    }

    public static Datos getInstance() {
        return miDatoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
