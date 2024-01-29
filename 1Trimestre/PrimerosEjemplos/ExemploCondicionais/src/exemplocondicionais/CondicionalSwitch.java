package exemplocondicionais;

import java.util.Scanner;

public class CondicionalSwitch {

    Scanner sc = new Scanner(System.in);

    public void verDia() {
        System.out.print("Introduzca el número del día de la semana: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día no válido. Debe estar entre 1 y 7.");
                break;
        }
    }
}