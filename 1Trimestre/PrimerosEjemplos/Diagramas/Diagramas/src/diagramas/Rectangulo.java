package diagramas;

public class Rectangulo {

    float base;
    float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
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

    public void calcularArea(float base, float altura) {
        System.out.println(base * altura);
    }

    public float calcularPerimetro() {
        return ((2 * base) + (2 * altura));
    }

}
