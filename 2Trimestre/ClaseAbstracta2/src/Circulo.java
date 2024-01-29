import java.util.Scanner;

public class Circulo extends FiguraGeometrica {
    private double radio;
    Scanner sc = new Scanner(System.in);
    @Override
    public void calcularArea() {
        System.out.print("Introduce el valor del radio: ");
        radio = sc.nextDouble();
        System.out.print("El valor del área es: " + Math.PI * Math.pow(radio, 2));
    }

    @Override
    public void calcularPerimetro() {
    }

}