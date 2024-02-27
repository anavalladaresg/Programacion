package boletin18_02;

import java.util.Scanner;

public class Servizos {

    private int zonaLocalizacion;
    private double peso;

    public Servizos() {
    }

    public Servizos(int zonaLocalizacion, double peso) {
        this.zonaLocalizacion = zonaLocalizacion;
        this.peso = peso;
    }

    public int getZonaLocalizacion() {
        return zonaLocalizacion;
    }

    public void setZonaLocalizacion(int zonaLocalizacion) {
        this.zonaLocalizacion = zonaLocalizacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Servizos{" + "zonaLocalizacion=" + zonaLocalizacion + ", peso=" + peso + '}';
    }

    public void amosarPrezo() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca la zona de localización:\nAmérica del Norte(pulse 1)\nAmérica Central(pulse 2)\nAmérica do Sur (pulse 3)\nEuropa(pulse 4)\nAsia(pulse 5)\nSalir(pulse 0)");
            zonaLocalizacion = sc.nextInt();
            switch (zonaLocalizacion) {
                case 1 -> {
                    System.out.println("Seleccione el peso del paquete");
                    peso = sc.nextDouble();
                    if (peso > 5) {
                        System.out.println("No se permiten paquetes de más de 5 Kg, lo sentimos mucho");
                    } else if (peso < 0) {
                        System.out.println("No se permiten pesos negativos");
                    } else {
                        double total = peso * 24;
                        System.out.println("El precio del paquete será de: " + total+" €");
                    }
                }
                case 2 -> {
                    System.out.println("Seleccione el peso del paquete");
                    peso = sc.nextDouble();
                    if (peso > 5) {
                         System.out.println("No se permiten paquetes de más de 5 Kg, lo sentimos mucho");
                    } else if (peso < 0) {
                         System.out.println("No se permiten pesos negativos");
                    } else {
                        double total = peso * 20;
                        System.out.println("El precio del paquete será de: " + total+" €");                    }
                }
                case 3 -> {
                    System.out.println("Seleccione el peso del paquete");
                    peso = sc.nextDouble();
                    if (peso > 5) {
                         System.out.println("No se permiten paquetes de más de 5 Kg, lo sentimos mucho");
                    }else if (peso < 0) {
                        System.out.println("No se permiten pesos negativos");
                    } else {
                        double total = peso * 21;
                        System.out.println("El precio del paquete será de: " + total+" €");
                    }
                }
                case 4 -> {
                    System.out.println("Seleccione el peso del paquete");
                    peso = sc.nextDouble();
                    if (peso > 5) {
                         System.out.println("No se permiten paquetes de más de 5 Kg, lo sentimos mucho");
                    }else if (peso < 0) {
                        System.out.println("No se permiten pesos negativos");
                    } else {
                        double total = peso * 10;
                        System.out.println("El precio del paquete será de: " + total+" €");
                    }
                }
                case 5 -> {
                    System.out.println("Seleccione el peso del paquete");
                    peso = sc.nextDouble();
                    if (peso > 5) {
                         System.out.println("No se permiten paquetes de más de 5 Kg, lo sentimos mucho");
                    }else if (peso < 0) {
                        System.out.println("No se permiten pesos negativos");
                    } else {
                        double total = peso * 18;
                        System.out.println("El precio del paquete será de: " + total+" €");
                    }
                }
                case 0 -> System.out.println("Saliendo del programa, ¡muchas gracias por contratar nuestros servicios!");
            }
        } while (zonaLocalizacion != 0);
    }
}
