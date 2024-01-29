package boletin04_01;

public class Boletin04_01 {

    public static void main(String[] args) {

        //Creación de un objeto
        Libro l = new Libro();
        l.setTitulo("Harry Potter y la Cámara Secreta");
        l.setAutor("J.K. Rowling");
        l.setAno(1998);
        l.setNumPaginas((short) 251);

        //Creacion de un objeto
        Libro l1 = new Libro("Harry Potter y la Piedra Filosofal", "J.K. "
                + "Rowling", 1997, (short) 223);

        l.amosarInformacion();
        l1.amosarInformacion();
    }

}
