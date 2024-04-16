package boletinextra02_02;

import java.util.Scanner;

public class CalcularEcuacion {

    Scanner sc = new Scanner(System.in);

    public void calcularEcuacion() {

        System.out.println("Calculadora de Ecuación de Segundo Grao");
        System.out.print("Introduce o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Introduce o valor de c: ");
        double c = sc.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("As solucións son raiz1 = " + raiz1 + " e raiz2 = " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A solución dobre é raiz = " + raiz);
        } else {
            System.out.println("Non hai solucións reais.");
        }

        sc.close();
    }

}
