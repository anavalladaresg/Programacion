package sumarestoproductocociente;

import java.util.Scanner;

public class SumaRestoProductoCociente {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();
        
        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    op.suma();
                    break;
                }
                case 2 -> {
                    op.resta();
                    break;
                }
                case 3 -> {
                    op.multiplicacion();
                    break;
                }
                case 4 -> {
                    op.division();
                    break;
                }
            }
        } while (opcion != 5);
        sc.close();
    }
    
}
