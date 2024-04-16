package boletinextra02_04;

public class BoletinExtra02_04 {

    public static void main(String[] args) {
        Conta c1 = new Conta("Ana", "ES2014568", 0.3,
                2300);
        Conta c2 = new Conta("Esteban", "ES20168543", 0.3,
                1721);

        c1.ingreso();
        c1.reintegro();
        c2.transferencia(c1);
    }

}
