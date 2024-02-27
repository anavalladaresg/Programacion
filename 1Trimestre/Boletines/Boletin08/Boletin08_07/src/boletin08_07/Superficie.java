package boletin08_07;

import java.util.Scanner;

public class Superficie {

    Scanner sc = new Scanner(System.in);
    double num1;
    double num2;
    double resultado;

    public void cuadrado() {
        System.out.println("Introduce el valor del lado: ");
        num1 = sc.nextInt();
        resultado = num1 * num1;
        System.out.println("La superficie del cuadrado es: " + resultado);
    }
    
    public void triangulo() {
        System.out.println("Introduce el valor de la base: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el valor de la altura: ");
        num2 = sc.nextInt();
        resultado = (num1*num2)/2;
        System.out.println("La superficie del triángulo es: " + resultado);
    }
    
    public void circulo() {
        System.out.println("Introduce el valor del radio: ");
        num1 = sc.nextInt();
        resultado = (Math.PI *Math.pow(num1, 2));
                System.out.println("La superficie del círculo es: " + resultado);

    }

    public void superficie() {
        System.out.println("Calcular la superficie de: \n1. Cuadrado \n2. Triángulo \n3. Círculo");
        int caso = sc.nextInt();
        switch (caso) {
            case 1 -> cuadrado();
            case 2 -> triangulo();
            case 3 -> circulo();
        }
    }
}
