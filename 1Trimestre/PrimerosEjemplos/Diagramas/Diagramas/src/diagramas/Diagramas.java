package diagramas;

public class Diagramas {

    public static void main(String[] args) {
        Rectangulo1 r1 = new Rectangulo1(5,9);
        System.out.println(r1);
        System.out.println(r1.toString());
        r1.calcularArea(10, 4);
        System.out.println("Perímetro: " + r1.calcularPerimetro());
    }

}
