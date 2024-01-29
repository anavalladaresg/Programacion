package diagramas;

public class Rectangulo1 {

    private float base;
    private float altura;

    public Rectangulo1() {
    }

    public Rectangulo1(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo1{" + "base=" + base + ", altura=" + altura + '}';
    }

    public void calcularArea(float base, float altura) {
        System.out.println(base * altura);
    }

    public float calcularPerimetro() {
        return 2 * base + 2 * altura;
    }
}
