package boletin15_01;

public class Boletin15_01 {

    // a. Crea unha superclase llamada SeleccionFutbol
    // b. Fai un diagrama da xerarquía de clases
    // c. Codifica un programa que reflicta este feito
    
    public static void main(String[] args) {
        Futbolista f = new Futbolista(10, "delantero", 1,
                "Lionel Andrés", "Messi", 36);
        f.xogarPartido();
        f.concentrarse();
        f.entrenar();
        f.viaxar();
        f.setEdade(37);

        SeleccionFutbol e = new Entrenador("española", 1,
                "Luis Enrique", "Martínez", 53);
    }

}
