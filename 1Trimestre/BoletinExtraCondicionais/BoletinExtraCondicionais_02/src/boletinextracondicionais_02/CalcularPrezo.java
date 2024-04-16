package boletinextracondicionais_02;

import java.util.Scanner;

public class CalcularPrezo {
    Scanner sc = new Scanner(System.in);
    char tipo;
    int tamano;
    double prezoInicial;
    double prezoFinal = prezoInicial; // Inicializamos co prezo inicial

    public void calcularPrezo() {

        System.out.print("Introduce o tipo da uva (A ou B): ");
        tipo = sc.next().charAt(0);

        System.out.print("Introduce o tamaño da uva (1 ou 2): ");
        tamano = sc.nextInt();

        System.out.print("Introduce o prezo inicial por quilo de uva: ");
        prezoInicial = sc.nextDouble();
        
        if (tipo == 'A') {
            if (tamano == 1) {
                prezoFinal -= 0.20;
            } else if (tamano == 2) {
                prezoFinal -= 0.30;
            }
        } else if (tipo
                == 'B') {
            if (tamano == 1) {
                prezoFinal += 0.30;
            } else if (tamano == 2) {
                prezoFinal += 0.50;
            }
        }

        System.out.println("O prezo final por quilo de uva é: " + prezoFinal + " euros");
    }
}
