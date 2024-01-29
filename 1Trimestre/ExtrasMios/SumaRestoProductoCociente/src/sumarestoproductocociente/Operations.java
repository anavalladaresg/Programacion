package sumarestoproductocociente;

import java.util.Scanner;

public class Operations {

    Scanner sc = new Scanner(System.in);
    float num1;
    float num2;
    float resultado;
    
    public void suma() {
        System.out.print("\t Ingrese el primer número: ");
        num1 = sc.nextFloat();
        System.out.print("\t Ingrese el segundo número: ");
        num2 = sc.nextFloat();
        this.resultado = this.num1 + this.num2;
        System.out.println("\t El resultado de la suma es: " + this.resultado);
    }

    public void resta() {
        System.out.print("\t Ingrese el primer número: ");
        num1 = sc.nextFloat();
        System.out.print("\t Ingrese el segundo número: ");
        num2 = sc.nextFloat();
        this.resultado = this.num1 - this.num2;
        System.out.println("\t El resultado de la resta es: " + this.resultado);
    }

    public void multiplicacion() {
        System.out.print("\t Ingrese el primer número: ");
        num1 = sc.nextFloat();
        System.out.print("\t Ingrese el segundo número: ");
        num2 = sc.nextFloat();
        this.resultado = this.num1 * this.num2;
        System.out.println("\t El resultado de la multiplicación es: " + 
                this.resultado);
    }

    public void division() {
        System.out.print("\t Ingrese el primer número: ");
        num1 = sc.nextFloat();
        System.out.print("\t Ingrese el segundo número: ");
        num2 = sc.nextFloat();
        this.resultado = this.num1 / this.num2;
        System.out.println("\t El resultado de la división es: " + 
                this.resultado);
    }

}
