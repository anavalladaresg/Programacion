package boletin09_02;

public class SumaProduto {
    
    public void sumarProducto() {
        int suma = 0;
        double producto = 1;
        int numero = 10;

        while (numero <= 90) {
            suma += numero;
            producto *= numero;
            numero++;
        }

        System.out.println("Suma dos números entre 10 e 90: " + suma);
        System.out.println("Produto dos números entre 10 e 90: " + producto);
    }
}
