package exemploestructurasrepetitivas;

public class BucleDoWhile {

    public void amosarDoWhile() {
        int i = 0;
        do {
            System.out.println("Dam1 --> " + (i+1));
             i++;
        } while (i <= 7);
        System.out.println("Fin do-while\n");
    }
    
    public void amosarPositivo() {
        float dato = LerDatos.lerFloatPositivo("Teclea dato positivo");
        System.out.println("Dato --> " + dato + "\nFin método\n");
    }
}
