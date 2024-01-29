package exemploherdanza;

import javax.swing.JOptionPane;

public class LerDatos {

    public static int lerEnteiro(String mensaxe) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }

    public static float lerFloatPositivo(String mensaxe) {
        float dato;
        do {
            dato = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        } while (dato <= 0);
        return dato;
    }

    public static String lerString(String mensaxe) {
        return JOptionPane.showInputDialog(mensaxe);
    }
}
