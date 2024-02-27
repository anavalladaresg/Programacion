package boletin06_03;

import javax.swing.JOptionPane;

public class Circulo {
    private double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce o valor do radio: "));
    private final double PI = 3.14;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        double area = PI * radio * radio;
        return area;
    }

    public double calcularLonxitude() {
        double lonxitude = 2 * PI * radio;
        return lonxitude;
    }
}
