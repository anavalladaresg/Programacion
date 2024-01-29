package boletinrepaso_01;

import javax.swing.JOptionPane;

public class LerDatos {

    public static int lerEnteiro(String mensaxe) {
        int resposta;
        do {
            resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        } while (resposta <= 0);
        return resposta;
    }

    public static float lerFloatPositivo(String mensaxe) {
        float dato;
        do {
            dato = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        } while (dato <= 0);
        return dato;
    }
}
