
package boletin3_1;

import java.util.Scanner;

public class Boletin3_1 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce o prezo da tarifa: ");
        double prezoTarifa = scanner.nextDouble();

        System.out.print("Introduce o prezo pagado: ");
        double prezoPagado = scanner.nextDouble();

        double porcentaxeDesconto = ((prezoTarifa - prezoPagado) / prezoTarifa) * 100;

        System.out.println("A porcentaxe de desconto é: " + porcentaxeDesconto + "%");

    }
    
}
