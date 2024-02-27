package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a cantidade en €: ");
        float euros = sc.nextFloat();

        System.out.print("Introduce el cambio de € a $: ");
        float cambio = sc.nextFloat();

        float dolares = euros * cambio;

        System.out.println(euros + "€ son " + dolares + "$");

        //o también
        //System.out.println(euros + "€ son " + (euros * cambio) + "$");

    }

}
