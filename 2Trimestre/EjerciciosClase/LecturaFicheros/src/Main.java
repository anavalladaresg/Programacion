import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String rutaArchivo = "/home/dam/Documentos/Programacion/2Trimestre/historias.txt";

        try {
            // Abrir el archivo para leerlo
            FileReader fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;

            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                System.out.println(linea); // Imprimir cada línea
            }

            // Cerrar el archivo
            br.close();
        } catch (IOException e) {
            // Si ocurre un error, imprimir el mensaje de error
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }
        Set<String> conjuntoSinOrden = new HashSet<>();
        conjuntoSinOrden.add("A"); // Agregar un elemento

    }
}