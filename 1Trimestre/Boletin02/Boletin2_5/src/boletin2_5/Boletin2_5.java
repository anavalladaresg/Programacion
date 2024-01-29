package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de millas: ");
        double millas = sc.nextDouble();
        final int VALOR = 1852;

        double metros = millas * VALOR;
        System.out.println(millas + " millas = " + metros + "metros.");

    }

}
