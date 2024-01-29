package boletin11_01;

import javax.swing.JOptionPane;

public class AdivinarNumero {

    public void adivinar() {
        int numeroAdivinar = 0;
        int intentosMaximos = 0;
        int intentos = 0;

        // Jugador 1 elige el número a adivinar
        while (numeroAdivinar < 1 || numeroAdivinar > 50) {

            numeroAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1, introduce o número a adiviñar (entre 1 e 50):"));
            if (numeroAdivinar < 1 || numeroAdivinar > 50) {
                JOptionPane.showMessageDialog(null, "O número debe estar entre 1 e 50.");
            }

        }

        // Jugador 1 elige el número máximo de intentos
        while (intentosMaximos <= 0) {

            intentosMaximos = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1, introduce o número máximo de intentos:"));
            if (intentosMaximos <= 0) {
                JOptionPane.showMessageDialog(null, "O número de intentos debe ser maior que 0.");
            }

        }

        JOptionPane.showMessageDialog(null, "Xogador 2, intenta adiviñar o número entre 1 e 50.");

        while (intentos < intentosMaximos) {
            String intentoStr = JOptionPane.showInputDialog("Introduce o teu intento:");

            int intento = Integer.parseInt(intentoStr);

            if (intento < 1 || intento > 50) {
                JOptionPane.showMessageDialog(null, "O número debe estar entre 1 e 50.");
            } else if (intento < numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "O número a adiviñar é maior.");
                intentos++;
            } else if (intento > numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "O número a adiviñar é menor.");
                intentos++;
            } else {
                JOptionPane.showMessageDialog(null, "Parabéns, adiviñaches o número " + numeroAdivinar + " en " + intentos + " intentos.");
                break;
            }

            if (intentos >= intentosMaximos) {
                JOptionPane.showMessageDialog(null, "Xogador 2, esgotaches os intentos. O número a adiviñar era " + numeroAdivinar + ".");
            }
        }
    }
}