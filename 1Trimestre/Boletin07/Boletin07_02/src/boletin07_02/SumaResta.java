package boletin07_02;

import java.util.Scanner;

public class SumaResta {

    Scanner sc = new Scanner(System.in);

    public void sumarERestar() {

        System.out.print("Introduce o primeiro número: ");
        short num1 = sc.nextShort();
        System.out.print("Introduce o segundo número: ");
        short num2 = sc.nextShort();

        int suma = num1 + num2;
        int resta = num1 - num2;

        if (num1 >= num2) {
            System.out.println("Suma: " + suma + "\nResta: " + resta);
        } else {
            System.out.println("Suma: " + suma);
        }
    }
}
