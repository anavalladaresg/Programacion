package boletin09_03;

public class AreaRectangulo {
    
    public void calcularArea() {
        float altura = LerDatos.lerFloatPositivo("Ingresa el valor de la altura.");
        float base = LerDatos.lerFloatPositivo("Ingresa el valor de la base.");
        float area = base * altura;
        System.out.println("El área de un rectángulo de base " + base + " y altura " +
                altura + " es: " + area);
    }
}