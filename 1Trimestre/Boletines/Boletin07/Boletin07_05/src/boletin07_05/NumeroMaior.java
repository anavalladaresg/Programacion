package boletin07_05;

import java.util.Scanner;

public class NumeroMaior {

    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    int num3;

    public void maiorNum() {
        System.out.print("Introduce o valor do primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce o valor do segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Introduce o valor do terceiro número: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}
