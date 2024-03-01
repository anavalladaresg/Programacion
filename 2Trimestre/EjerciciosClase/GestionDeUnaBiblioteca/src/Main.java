import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("El Quijote", "Cervantes"));
        listaLibros.add(new Libro("El hobbit", "Tolkien"));
        listaLibros.add(new Libro("Cien años de soledad", "García Márquez"));

        mostrar(listaLibros);

        mostrarAutor("El hobbit", listaLibros);
    }

    private static void mostrar(List<Libro> listaLibros) {
        for (Libro libro : listaLibros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }

    public static void mostrarAutor(String titulo, List<Libro> listaLibros) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equals(titulo)) {
                System.out.println("El autor de '" + titulo + "' es: " + libro.getAutor());
            }
        }
    }
}