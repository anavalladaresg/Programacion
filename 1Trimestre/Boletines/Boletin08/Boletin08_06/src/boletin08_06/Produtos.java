package boletin08_06;

import java.util.Scanner;

public class Produtos {

    Scanner sc = new Scanner(System.in);

    public void tipo() {
        System.out.print("Introduce o nome do artigo: ");
        String nomeArtigo = sc.nextLine();

        System.out.print("Introduce as vendas anuais: ");
        int vendasAnuais = sc.nextInt();

        String tipo;

        if (vendasAnuais <= 100) {
            tipo = "baixo";
        } else if (vendasAnuais <= 500) {
            tipo = "medio";
        } else if (vendasAnuais <= 1000) {
            tipo = "alto";
        } else {
            tipo = "primeira necesidade";
        }

        System.out.println("O artigo '" + nomeArtigo + "' é de tipo '" + tipo + "'.");
    }
}