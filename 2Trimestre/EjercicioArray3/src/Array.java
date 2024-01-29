import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Array {
    Scanner sc = new Scanner(System.in);

    int[] lista = {1, 2, 6, 8, 7};

    public void buscar() {
        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Elija el número a buscar"));
            int busqueda = Arrays.binarySearch(lista, numero);

            if (busqueda < 0) {
                int decision = JOptionPane.showConfirmDialog(null, "El número " + numero + " no se encuentra en la lista. ¿Le gustaría buscar otro número?", "Confirmar búsqueda", JOptionPane.YES_NO_OPTION);

                if (decision == JOptionPane.NO_OPTION) {
                    break;
                }
            } else {
                System.out.println("El número " + numero + " se encuentra en la posición " + busqueda);
                break;
            }
        } while (true);
    }

    public void ordenar() {
        Arrays.sort(lista);
        System.out.println("Array ordenado: " + Arrays.toString(lista));
    }

}
