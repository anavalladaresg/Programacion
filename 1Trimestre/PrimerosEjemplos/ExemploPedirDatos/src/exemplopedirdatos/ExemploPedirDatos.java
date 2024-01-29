package exemplopedirdatos;

import java.util.Scanner;

public class ExemploPedirDatos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Calcular o area dun rectángulo
        System.out.print("Altura: ");
        float altura = sc.nextFloat();
        System.out.print("Base: ");
        float base = sc.nextFloat();
        float area = base * altura;

        System.out.println("O area dun rectángulo de altura " + altura + " e "
                + "base " + base + " é: " + area);

        //Calcular a lonxitude dun círculo
        System.out.println("Radio:");
        float ra = sc.nextFloat();
        float lonxitude = (float) (2*Math.PI*ra);
        
        System.out.println("A lonxitude dun círculo de radio: " + ra + " é: " 
                + lonxitude);
    }

}
