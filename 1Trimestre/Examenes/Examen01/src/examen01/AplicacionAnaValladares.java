package examen01;

import java.util.Scanner;

public class AplicacionAnaValladares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cartos;
        int opcion;

        //Instancia un obxecto coche1 con valores CitroenC4 e 7000
        Coche coche1 = new Coche("Citroen C4", 7000);
        FeiraCoches feira = new FeiraCoches();
        feira.c = coche1;

        //Instancia un obxecto coche1 con valores CitroenC4 e 7000
        /*FeiraCoches coche1 = new FeiraCoches();

        coche1.c.setMarca(scanner.nextLine());
        coche1.c.setPrezo(scanner.nextFloat());*/

        do {

            //Programa repetitivo
            System.out.println("\n1. Amosar Coche");
            System.out.println("2. Rebaixar Prezo");
            System.out.println("3. Comprobar Saldo Comprador");
            System.out.println("0. Saír");
            System.out.print("Escolle unha opción: ");
            opcion = scanner.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1 ->
                    feira.amosar();
                case 2 -> {
                    System.out.println("Introduce o % que queres rebaixar");
                    feira.baixarPrezo(scanner.nextFloat());
                }
                case 3 -> {
                    //Comproba que o comprador dispón dos cartos suficientes para comprar o 
                    //coche (despois do desconto)
                    System.out.print(
                            "Introduza os cartos dispoñibles para mercar o coche:");
                    cartos = scanner.nextInt();
                    if (cartos >= feira.c.getPrezo()) {
                        System.out.println("Coche mercado");
                    } else {
                        System.out.println("Non o podes mercar");
                    }
                }
                case 0 ->
                    System.out.println("Saíndo do programa.");
                default ->
                    System.out.println("Opción non válida.");
            }

        } while (opcion != 0);
        scanner.close();
    }

}
