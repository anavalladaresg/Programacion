package exemploPaquetes;

import com.ana.concesionario.contabilidade.Facturas;
import com.ana.concesionario.taller.Pezas;

public class ExemploPaquetes {

    public static void main(String[] args) {
        
        //Acceder a un atributo público
        Pezas p = new Pezas();
        System.out.println(p.nomePeza);
        
        //Acceder a un atributo private (mediante método público)
        Facturas f = new Facturas();
        System.out.println(f.getSueldo());
        
    }

}
