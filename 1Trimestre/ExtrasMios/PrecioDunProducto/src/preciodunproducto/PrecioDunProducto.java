
package preciodunproducto;

import java.util.Scanner;

public class PrecioDunProducto {
    
    float prezoSenIva;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float prezoSenIva = sc.nextFloat();
        final float IVA = 1.21f;
        
        PrecioDunProducto producto = new PrecioDunProducto();
        float prezoFinal = producto.calcularPrezo(prezoSenIva, IVA);
        System.out.println("O prezo final do producto é: " + prezoFinal + ".");
    }
    
    private float calcularPrezo(float prezo, float IVA) {
        float prezoFinal = this.prezoSenIva + (prezo*IVA);
        return prezoFinal;
    }
    
}
