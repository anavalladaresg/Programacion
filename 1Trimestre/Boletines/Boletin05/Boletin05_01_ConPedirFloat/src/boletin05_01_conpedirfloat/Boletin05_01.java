package boletin05_01_conpedirfloat;

import java.util.Scanner;

public class Boletin05_01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce kilometros : ");
        float km = sc.nextFloat();
        System.out.print("Introduce litros : ");
        float litros = sc.nextFloat();
        System.out.print("Introduce velocidad media : ");
        float vMed = sc.nextFloat();
        System.out.print("Introduce precio gasolina : ");
        float pGas = sc.nextFloat();

        // Constructor por defecto
        Coche c = new Coche();
        c.setLitros(litros);
        c.setpGas(pGas);
        c.setKms(km);
        c.setvMed(vMed);
        System.out.println("Consumo medio = " + c.consumoMedio() + " litros/km");
        System.out.println("Velocidade media = " + c.getvMed() + " Km/h");
        System.out.println("Tiempo viaje = " + c.getTempo() + " Horas");

        // Constructor parametrizado
        Coche c2 = new Coche(km, litros, vMed, pGas);
        System.out.println("Consumo medio = " + c2.consumoMedio() + " litros/km");
        System.out.println("Velocidade media = " + c2.getvMed() + " Km/h");
        System.out.println("Tiempo viaje = " + c2.getTempo() + " Horas");
    }

}
