package boletin16;

public class Libro extends Publicacion {

    private boolean prestado;

    public Libro() {
    }

    public Libro(boolean prestado) {
        this.prestado = prestado;
    }

    public Libro(boolean prestado, int codigo, String titulo, String ano) {
        super(codigo, titulo, ano);
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString() + "Libro{" + "prestado=" + prestado + '}';
    }

}
