package boletinextra06_01;

import java.util.Scanner;

public class CotaPadel {

    public void calcularCota() {
        Scanner input = new Scanner(System.in);

        final int CUOTA = 800;
        double descuento = 0.0;

        System.out.print("Introduce la edad: ");
        int edad = input.nextInt();

        if (edad <= 0) {
            System.out.println("Introduce una edad válida.");
            input.close();
            return;
        }

        System.out.print("¿Los padres son socios? (Sí/No): ");
        String respuesta = input.next();

        if (edad > 65) {
            descuento = 0.40;
        } else if (edad < 21) {
            if (respuesta.equalsIgnoreCase("No")) {
                descuento = 0.25;
            } else {
                descuento = 0.45;
            }
        }
        double cuotaFinal = CUOTA - (CUOTA * descuento);
        System.out.println("La cuota a pagar es: " + cuotaFinal + " euros");

        input.close();
    }
}
