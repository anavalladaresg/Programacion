package boletinextracondicionais_01;

import java.util.Scanner;

public class ContarCifra {

    Scanner sc = new Scanner(System.in);
    int num;

    public void contar() {
        System.out.print("Ingresa un número entero entre 0 y 99999: ");
        num = sc.nextInt();

        if (num >= 0 && num <= 99999) {
            String numeroStr = Integer.toString(num);
            int cifras = numeroStr.length();
            System.out.println("El número " + num + " tiene " + cifras + " cifras.");
        } else {
            System.out.println("El número ingresado no está en el rango especificado.");
        }
    }
}