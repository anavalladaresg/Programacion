import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que lee el contenido del fichero tareas.txt y lo muestra por pantalla.
 * @version 1.0
 * @author Ana Valladares
 */

public class Tareas {

    /**
     * Lee el fichero tareas.txt y muestra su contenido por pantalla.
     */
    public void leerFichero() {
        try {
            FileReader fr = abrirFichero();
            BufferedReader br = new BufferedReader(fr);
            leerArchivo(br);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Lee el contenido del fichero línea a línea y lo muestra por pantalla.
     */
    private static void leerArchivo(BufferedReader br) throws IOException {
        String linea;
        int numeroLinea = 1;
        while ((linea = br.readLine()) != null) {
            System.out.println(numeroLinea + ". " + linea);
            numeroLinea++;
        }
        br.close();
    }

    /**
     * Abre el fichero tareas.txt.
     * @return FileReader
     */
    private static FileReader abrirFichero() throws FileNotFoundException {
        return new FileReader("/home/dam/Documentos/Programacion/2Trimestre/tareas.txt");
    }
}