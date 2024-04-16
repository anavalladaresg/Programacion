package boletin07_01;

import java.util.Scanner;

public class NumeroPositivo {

    Scanner sc = new Scanner(System.in);

    public void verPositivo() {
        System.out.print("Introduce un número: ");
        int num1 = sc.nextInt();
        if (num1 >= 0) {
            System.out.println("É positivo");
        }
    }
}
