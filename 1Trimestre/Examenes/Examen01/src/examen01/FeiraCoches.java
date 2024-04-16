package examen01;

/**
 * @author Ana
 * @version 1.0
 */
public class FeiraCoches {

    Coche c;

    public void amosar() {
        System.out.println("Marca: " + c.getMarca() + ".\nPrezo: " + c.getPrezo());
    }

    public float baixarPrezo(float porcentaxe) {
        float rebaixa = c.getPrezo() - (c.getPrezo() * porcentaxe / 100f);
        System.out.println("O coche costa ahora un " + porcentaxe + "% menos: " + rebaixa);
        return rebaixa;
    }

}
