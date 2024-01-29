package exemplocondicionais;

public class ExemploCondicionais {

    public static void main(String[] args) {

        // IF
        CondicionalSimple cs = new CondicionalSimple();
        cs.verMaior(15, 10);
        cs.maiorDeIdade(20);

        // IF ELSE
        CondicionalDobre cd = new CondicionalDobre();
        cd.verMaior(3, 7);

        // ELSE IF  
        CondicionalAnidado ca = new CondicionalAnidado();
        ca.verConAnidados(2, 5);
        
        // SWITCH
        CondicionalSwitch csw = new CondicionalSwitch();
        csw.verDia();
    }

}
