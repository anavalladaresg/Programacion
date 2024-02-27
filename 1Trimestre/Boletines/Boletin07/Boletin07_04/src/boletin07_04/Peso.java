package boletin07_04;

import java.util.Scanner;

public class Peso {

    Scanner sc = new Scanner(System.in);
    String nome1;
    String nome2;
    int peso1;
    int peso2;

    public void verPeso() {
        System.out.print("Introduce o nome da primeira persoa: ");
        nome1 = sc.nextLine();
        System.out.print("Introduce o peso da primeira persoa: ");
        peso1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce o nome da segunda persoa: ");
        nome2 = sc.nextLine();
        System.out.print("Introduce o peso da segunda persoa: ");
        peso2 = sc.nextInt();
        if (peso1 > peso2) {
            System.out.println(nome1 + " pesa máis, cunha diferencia de " + (peso1 - peso2) + "kg.");
        } else if (peso1 == peso2) {
            System.out.println(nome1 + " e " + nome2 + " pesan o mesmo.");
        } else {
            System.out.println(nome2 + " pesa máis, cunha diferencia de " + (peso2 - peso1) + "kg.");
        }
    }
}
