import java.util.Scanner;

public class Llamada {

    private int tempo;
    private String diaSemana;
    private String momentoDia;

    public Llamada() {
    }

    public Llamada(int tempo, String diaSemana, String momentoDia) {
        this.tempo = tempo;
        this.diaSemana = diaSemana;
        this.momentoDia = momentoDia;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getMomentoDia() {
        return momentoDia;
    }

    public void setMomentoDia(String momentoDia) {
        this.momentoDia = momentoDia;
    }

    @Override
    public String toString() {
        return "Llamada{" + "tempo=" + tempo + ", diaSemana=" + diaSemana + ", momentoDia=" + momentoDia + '}';
    }

    public void custoLlamada() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int duracionLlamada = scanner.nextInt();

        System.out.print("Ingrese el día de la semana (1 para domingo, 2 para otro día): ");
        int diaSemana = scanner.nextInt();

        System.out.print("Ingrese la quenda del día (1 para mañana, 2 para tarde): ");
        int quendaDia = scanner.nextInt();

        double costoLlamada = calcularCostoLlamada(duracionLlamada);
        double impuesto = calcularImpuesto(diaSemana, quendaDia);

        double totalPagar = costoLlamada + impuesto;

        System.out.println("\nResumen de la llamada:");
        System.out.println("Costo de la llamada: " + costoLlamada + " euros");
        System.out.println("Impuesto aplicado: " + impuesto + " euros");
        System.out.println("Total a pagar: " + totalPagar + " euros");

        scanner.close();
    }

    private static double calcularCostoLlamada(int duracion) {
        double costo = 0;

        if (duracion <= 5) {
            costo = duracion * 1.0;
        } else if (duracion <= 8) {
            costo = 5 + (duracion - 5) * 0.8;
        } else if (duracion <= 10) {
            costo = 5 + 3 * 0.8 + (duracion - 8) * 0.7;
        } else {
            costo = 5 + 3 * 0.8 + 2 * 0.7 + (duracion - 10) * 0.5;
        }

        return costo;
    }

    private static double calcularImpuesto(int dia, int quenda) {
        double impuesto = 0;

        if (dia == 1) {
            impuesto = 0.03;
        } else {
            if (quenda == 1) {
                impuesto = 0.15;
            } else {
                impuesto = 0.10;
            }
        }

        return impuesto;
    }
}