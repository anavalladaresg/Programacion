package diasemana;

import java.util.Scanner;

public class Semana {

    Scanner sc = new Scanner(System.in);

    public void selectDia() {
        System.out.print("Introduzca el número del día de la semana: ");
        int num = sc.nextInt();

        switch (num) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número de día no válido. Debe estar entre 1 y 7.");
        }
    }
}
