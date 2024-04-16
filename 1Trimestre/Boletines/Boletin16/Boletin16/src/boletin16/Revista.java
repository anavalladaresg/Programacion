package boletin16;

public class Revista extends Publicacion {

    private int num;

    public Revista() {
    }

    public Revista(int num) {
        this.num = num;
    }

    public Revista(int num, int codigo, String titulo, String ano) {
        super(codigo, titulo, ano);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString() + "Revista{" + "num=" + num + '}';
    }

}
