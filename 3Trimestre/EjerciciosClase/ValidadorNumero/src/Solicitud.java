import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase se encarga de solicitar números al usuario.
 */
public class Solicitud implements Validador {
    Scanner sc = new Scanner(System.in);
    int numero;

    /**
     * Pide un número al usuario.
     */
    @Override
    public boolean validadorNumero() {
        numero = sc.nextInt();
        return false;
    }

    /**
     * Solicita números al usuario hasta que se introduzca un 0.
     */
    public void solicitarNumero() {
        System.out.println("Por favor, introduzca números y pulse 0 para cerrar");
        do {
            try {
                validadorNumero();
                if (numero % 2 == 0) {
                    System.out.println("Par");
                } else {
                    System.out.println("Impar");
                }

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (numero != 0);
    }
}