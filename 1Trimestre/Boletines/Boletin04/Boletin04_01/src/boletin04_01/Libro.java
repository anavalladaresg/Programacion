package boletin04_01;

public class Libro {

    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    //Constructor por defecto
    public Libro() {

    }

    //Constructor parametrizado
    public Libro(String titulo, String autor, int ano, short numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    //Método para visualizar la información de los libros
    public void amosarInformacion() {
        System.out.println("Título: " + titulo + "\nAutor: " + autor + "\nAno: "
                + ano + "\nNúmero de páxinas: " + numPaginas + "\nValoración: "
                + valoracion);
    }

}
