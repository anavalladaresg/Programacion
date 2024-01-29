package eobx;

public class EObx {

    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();

        rec1.setBase(5f);
        float base = rec1.getBase();
        System.out.println("Base rectángulo 1: " + base);

        rec1.setAltura(4.3f);
        float altura = rec1.getAltura();
        System.out.println("Altura rectángulo 1: " + altura);
        //O también
        //System.out.println("Altura: " + rec1.getAltura());
        
        rec1.calcularArea(6f, 7f);
        System.out.println("Perímetro rectángulo 1: " + rec1.calcularPerimetro(6, 7));
        
        Rectangulo rec2 = new Rectangulo(4.1f, 3.6f);
        System.out.println("Altura rectángulo 2: " + rec2.getAltura());
        System.out.println("Base rectángulo 2: " + rec2.getBase());
    }

}
