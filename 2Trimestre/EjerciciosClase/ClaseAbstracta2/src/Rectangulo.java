import java.util.Scanner;

public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;
    Scanner sc = new Scanner(System.in);

    @Override
    public void calcularArea() {
    }

    @Override
    public void calcularPerimetro() {
        System.out.print("Introduce el valor de la base: ");
        base = sc.nextDouble();
        System.out.print("Introduce el valor de la altura: ");
        altura = sc.nextDouble();
        System.out.println("El valor del perímetro es: " + (base * altura));
    }
}
