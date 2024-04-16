import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

    public void escribir() {
        try {
            String archivo = "notas.txt";
            FileWriter fr = new FileWriter(archivo);
            BufferedWriter br = new BufferedWriter(fr);
            br.write("Java es divertido\n");
            br.write("La práctica hace al maestro\n");
            br.write("Persistencia es clave para el éxito");
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
