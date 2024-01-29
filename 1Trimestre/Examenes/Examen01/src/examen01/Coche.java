package examen01;


/**
 * @author Ana
 * @version 1.0
 */
public class Coche {

    private String marca;
    private float prezo;

    public Coche(String marca, float prezo) {
        this.marca = marca;
        this.prezo = prezo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        marca = this.marca;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void modificarPrezo(float prezo) {
        this.prezo = prezo;
    }

}
