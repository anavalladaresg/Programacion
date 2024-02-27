package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce o primeiro número: ");
        double num1 = sc.nextFloat();
        System.out.print("Introduce o segundo número: ");
        double num2 = sc.nextFloat();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        double cociente = num1 / num2;

        System.out.println("Suma = " + suma + ", resta = " + resta
                + ", producto = " + producto + ", cociente = " + cociente);
    }

}
