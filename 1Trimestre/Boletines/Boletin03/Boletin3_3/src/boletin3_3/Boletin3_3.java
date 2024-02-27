package boletin3_3;

import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce o número de billetes de 100 €: ");
        int billetes100 = scanner.nextInt();

        System.out.print("Introduce o número de billetes de 20 €: ");
        int billetes20 = scanner.nextInt();

        System.out.print("Introduce o número de billetes de 5 €: ");
        int billetes5 = scanner.nextInt();

        System.out.print("Introduce o número de moedas de 1 €: ");
        int moedas1 = scanner.nextInt();

        double totalEuros = (billetes100 * 100 + billetes20 * 20 + billetes5 * 5 + moedas1) / 100.0;

        System.out.println("O equivalente total en euros é: " + totalEuros + " €");
    }
    
}
