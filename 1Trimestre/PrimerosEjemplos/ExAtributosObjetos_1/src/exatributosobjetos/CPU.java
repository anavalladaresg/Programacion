package exatributosobjetos;

public class CPU {

    private int velocidade;
    private int almacenamento;

    public CPU() {
    }

    public CPU(int velocidade, int alamacenamento) {
        this.velocidade = velocidade;
        this.almacenamento = alamacenamento;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAlamacenamento() {
        return almacenamento;
    }

    public void setAlamacenamento(int alamacenamento) {
        this.almacenamento = alamacenamento;
    }

    @Override
    public String toString() {
        return "CPU{" + "velocidade=" + velocidade + ", alamacenamento=" + almacenamento + '}';
    }

}
