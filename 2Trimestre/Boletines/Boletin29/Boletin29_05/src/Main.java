import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", 1, "Ventas"));
        empleados.add(new Empleado("Ana", 2, "Marketing"));

        try {
            // Guardar la lista de empleados a un archivo
            FileOutputStream fos = new FileOutputStream("empleados.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(empleados);
            oos.close();
            fos.close();

            // Cargar la lista de empleados desde un archivo
            FileInputStream fis = new FileInputStream("empleados.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Empleado> empleadosCargados = (List<Empleado>) ois.readObject();
            ois.close();
            fis.close();

            // Imprimir los empleados cargados
            for (Empleado empleado : empleadosCargados) {
                System.out.println("Nombre: " + empleado.getNombre() + ", ID: " + empleado.getId() + ", Departamento: " + empleado.getDepartamento());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Clase Empleado no encontrada");
            c.printStackTrace();
        }
    }
}