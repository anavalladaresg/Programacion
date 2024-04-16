package boletinextra02_01;

import java.util.Scanner;

public class CalcularPrezo {

    Scanner sc = new Scanner(System.in);
    final float IVA = 1.21f;

    public void calcularPrezo() {
        
        System.out.println("Calculadora de IVA");
        System.out.print("Introduce o prezo sen IVA: ");
        float prezoSenIva = sc.nextFloat();
        
        float prezoFinal = prezoSenIva + (prezoSenIva * IVA);
        System.out.println("O prezo final do producto é: " + prezoFinal + ".");    
    }

}
