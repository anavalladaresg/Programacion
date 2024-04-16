package exemjoptionpane;

import javax.swing.JOptionPane;

public class ExemJOptionPane {

    public static void main(String[] args) {

        // Pedir datos
        float dato = Float.parseFloat(JOptionPane.showInputDialog("Teclea dato: "));

        // Mostrar datos
        System.out.println(dato);
            // O también
        JOptionPane.showInputDialog("O valor é : " + dato);
            // O también
        JOptionPane.showMessageDialog(null, "O valor é: " + dato);
    }

}