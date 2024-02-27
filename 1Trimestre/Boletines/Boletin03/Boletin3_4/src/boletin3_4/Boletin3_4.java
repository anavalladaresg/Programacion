package boletin3_4;

import java.util.Scanner;

public class Boletin3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce a cantidade en euros: ");
        int cantidadeEuros = scanner.nextInt();

        int billetes100 = cantidadeEuros / 100;
        cantidadeEuros %= 100;
        
        int billetes20 = cantidadeEuros / 20;
        cantidadeEuros %= 20;

        int billetes5 = cantidadeEuros / 5;
        cantidadeEuros %= 5;

        int moedas1 = cantidadeEuros;

        System.out.println("Desglose de " + cantidadeEuros + " euros:");
        System.out.println("Billetes de 100 €: " + billetes100);
        System.out.println("Billetes de 20 €: " + billetes20);
        System.out.println("Billetes de 5 €: " + billetes5);
        System.out.println("Moedas de 1 €: " + moedas1);
    }
    
}
