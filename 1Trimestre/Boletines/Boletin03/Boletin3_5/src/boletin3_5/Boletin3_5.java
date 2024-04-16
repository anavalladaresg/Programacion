
package boletin3_5;

import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce o soldo fixo: ");
        double soldoFixo = sc.nextDouble();

        System.out.print("Introduce o importe total de vendas: ");
        double importeVendas = sc.nextDouble();

        System.out.print("Introduce o número de quilómetros percorridos: ");
        double quilometraxe = sc.nextDouble();

        System.out.print("Introduce o número de días de desprazamento: ");
        int diasDesprazamento = sc.nextInt();

        double comision = 0.05 * importeVendas;
        double dietas = 30 * diasDesprazamento;
        double retencionIRPF = 0.18 * (soldoFixo + comision);
        double retencionSeguridadeSocial = 36;
        
        double soldoBruto = soldoFixo + comision + (quilometraxe * 2) + dietas;
        double soldoLiquido = soldoBruto - retencionIRPF - retencionSeguridadeSocial;
        
        System.out.println("O soldo bruto é: " + soldoBruto);
        System.out.println("O soldo líquido é: " + soldoLiquido);
    }
    
}
