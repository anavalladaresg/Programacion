import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temporizador {
    public static void main(String[] args) {
        final int[] contador = {0};

        final String MENSAJEPREDETERMINADO = "Se acabó el tiempo";

        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador[0]++;

                if (contador[0] % 5 == 0) {
                    System.out.println("Múltiplo de 5");
                } else {
                    System.out.println("Mensaje " + contador[0] + ": " + MENSAJEPREDETERMINADO);
                }
            }
        });

        timer.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        timer.stop();
    }
}