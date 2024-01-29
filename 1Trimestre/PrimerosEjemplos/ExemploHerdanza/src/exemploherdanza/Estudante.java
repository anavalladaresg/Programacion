package exemploherdanza;

public class Estudante extends Persoa {

    private float notaFinal;

    public Estudante(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Estudante(float notaFinal, String nome, String apelido, int edade) {
        super(nome, apelido, edade);
        this.notaFinal = notaFinal;
    }

    public Estudante() {
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudante{" + "notaFinal=" + notaFinal + '}';
    }

}
