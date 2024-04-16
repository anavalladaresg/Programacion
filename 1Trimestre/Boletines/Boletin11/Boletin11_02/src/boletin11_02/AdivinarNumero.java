package boletin11_02;

import java.util.Random;
import javax.swing.JOptionPane;

public class AdivinarNumero {

    public void adivinar() {
        Random rand = new Random();
        int numeroAdivinar = rand.nextInt(50) + 1; // Número aleatorio entre 1 y 50
        int intentosMaximos = 0;
        int intentos = 0;

        // Jugador elige el número máximo de intentos
        while (intentosMaximos <= 0) {
            intentosMaximos = Integer.parseInt(JOptionPane.showInputDialog("Xogador, introduce o número máximo de intentos:"));
            if (intentosMaximos <= 0) {
                JOptionPane.showMessageDialog(null, "O número de intentos debe ser maior que 0.");
            }
        }

        JOptionPane.showMessageDialog(null, "Xogador, intenta adiviñar o número entre 1 e 50.");

        while (intentos < intentosMaximos) {
            String intentoStr = JOptionPane.showInputDialog("Introduce o teu número:");
            int intento = Integer.parseInt(intentoStr);

            if (intento < 1 || intento > 50) {
                JOptionPane.showMessageDialog(null, "O número debe estar entre 1 e 50.");
            } else {
                int distancia = Math.abs(numeroAdivinar - intento);
                
                if (intento == numeroAdivinar) {
                    JOptionPane.showMessageDialog(null, "Parabéns, adiviñaches o número " + numeroAdivinar + " en " + intentos + " intentos.");
                    break;
                }
                
                if (distancia > 20) {
                    JOptionPane.showMessageDialog(null, "Moi lonxe.");
                } else if (distancia >= 10 && distancia <= 20) {
                    JOptionPane.showMessageDialog(null, "Lonxe.");
                } else if (distancia > 5 && distancia < 10) {
                    JOptionPane.showMessageDialog(null, "Preto.");
                } else if (distancia <= 5) {
                    JOptionPane.showMessageDialog(null, "Moi preto.");
                }

                intentos++;

            }

            if (intentos >= intentosMaximos) {
                JOptionPane.showMessageDialog(null, "Xogador, esgotaches os intentos. O número a adiviñar era " + numeroAdivinar + ".");
            }
        }
    }
}
