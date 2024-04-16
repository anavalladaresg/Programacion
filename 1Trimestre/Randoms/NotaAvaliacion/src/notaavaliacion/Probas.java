
package notaavaliacion;

import java.util.Scanner;

public class Probas {
    
    Scanner sc = new Scanner(System.in);
    private double notaTeorica1;
    private double notaTeorica2;
    private double mediaTeorica;
    private final double PORCENTAXE_TEORICA = 0.40;
    private double notaPractica;
    private double mediaPractica;
    private final double PORCENTAXE_PRACTICA = 0.40;
    private final byte TOTAL_BOLETINS = 23;
    private int boletins;
    private final byte MAX = 2;
    private final byte MEDIO = 1;
    private final byte MIN = 0;
    private final double PORCENTAXE_BOLETIN = 0.20;
    private double mediaBoletins;
    
    public void pedirNotas() {
        System.out.println("Introduce a nota da primeira proba escrita: ");
        notaTeorica1 = sc.nextDouble();
        System.out.println("Introduce a nota da segunda proba escrita: ");
        notaTeorica2 = sc.nextDouble();
        System.out.println("Introduce a nota da proba práctica: ");
        notaPractica = sc.nextDouble();
        System.out.println("Introduce o número de boletíns entregados: ");
        boletins = sc.nextInt();
    }
    
    public void calcularMedia() {
        mediaTeorica = (notaTeorica1 + notaTeorica2)*PORCENTAXE_TEORICA;
        mediaPractica = notaPractica * PORCENTAXE_PRACTICA;
        if (boletins > (TOTAL_BOLETINS*0.90)) {
            mediaBoletins = MAX;
        } else if ((TOTAL_BOLETINS*0.70) <= boletins && boletins <= (TOTAL_BOLETINS*0.90)) {
            mediaBoletins = MEDIO;
        } else {
            mediaBoletins = MIN;
        }
    }
    
}
