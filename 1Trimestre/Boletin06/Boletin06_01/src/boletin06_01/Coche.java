package boletin06_01;

import javax.swing.JOptionPane;

public class Coche {

    private int velocidade;

    public Coche() {
        velocidade = 0;
    }

    public int getVelocidade() {
        velocidade = Integer.parseInt(JOptionPane.showInputDialog("Introduce la velocidad actual: "));
        return velocidade;
    }

    public void acelerar() {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la aceleración: "));
        velocidade += valor;
        JOptionPane.showMessageDialog(null, "Se aceleró a: " + velocidade + "km/h");
    }

    public void frenar() {
        int menos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la deceleración: "));
        velocidade -= menos;
        JOptionPane.showMessageDialog(null, "Se frenó en: " + velocidade + "km/h");
    }
    
}
