package rebajaprecios;

public class RebajaPrecios {

    public static void main(String[] args) {

        double prezoPantalon = 90;
        double rebaixa = 0.25;

        double prezoRebaixa = prezoPantalon * rebaixa;
        double prezoRebaixado = prezoPantalon - prezoRebaixa;
        
        System.out.println("O prezo do pantalón rebaixado é: " + prezoRebaixado);

    }

}
