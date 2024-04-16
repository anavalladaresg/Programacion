import java.io.*;

public class Lectura {
    public void leer() {
        try {
            String linea;
            String archivo = "notas.txt";
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while((linea = br.readLine()) != null) {

                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
