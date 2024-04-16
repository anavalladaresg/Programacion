package boletinrepaso_01;

public class Main {

    public static void main(String[] args) {

        // 1. Sacar por consola 5 veces a frase "isto é un bucle"
        BoletinRepaso01 b01 = new BoletinRepaso01();
        b01.frasear();

        // 2. Visualizar 5 números que pides por teclado 
        BoletinRepaso02 b02 = new BoletinRepaso02();
        b02.visualizar();
        
        // 3. Visualizar varios números que pides por teclado, remata cando premes 0
        BoletinRepaso03 b03 = new BoletinRepaso03();
        b03.visualizarNums();
        
        // 4. Visualizar 4 numeros que entren por teclado. Os números non poden ser negativos 
        BoletinRepaso04y05 b04 = new BoletinRepaso04y05();
        b04.verPositivos();

        // 6. Calcula o área dun cadrado pedindo o valor por teclado tendo en conta que non pode ser negativo
        BoletinRepaso_06y07 br6 = new BoletinRepaso_06y07();
        br6.calcaularArea();

        // 8. Calcular o área de varios cadrados, rematando con 0
        BoletinRepaso_08 br8 = new BoletinRepaso_08();
        br8.calcularArea();

        // 9.
        BoletinRepaso_09 br9 = new BoletinRepaso_09();
        br9.sumarNumeros();

        // 10.
        BoletinRepaso_10 br10 = new BoletinRepaso_10();
        br10.mediaNotas();

        // 11.
        BoletinRepaso_11 br11 = new BoletinRepaso_11();
        br11.mediaNotas();

        // 12.
        BoletinRepaso_12 br12 = new BoletinRepaso_12();
        br12.media();
    }

}
