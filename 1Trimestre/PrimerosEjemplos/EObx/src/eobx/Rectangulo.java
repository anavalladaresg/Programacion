package eobx;

public class Rectangulo {

    private float base;
    private float altura;

    //Constructor
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo() {
        //Este es el constructor por defecto de java
    }

    //Getters y Setters
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Métodos
    public void calcularArea(float base, float altura) {
        float area = base * altura;
        System.out.println("Área: " + area);
    }

    public float calcularPerimetro(float base, float altura) {
        float perimetro = base * 2 + altura * 2;
        return perimetro;
        //también return base*2 + altura*2;
    }

}
