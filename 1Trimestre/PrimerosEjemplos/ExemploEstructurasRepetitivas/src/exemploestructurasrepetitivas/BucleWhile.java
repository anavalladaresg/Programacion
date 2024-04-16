package exemploestructurasrepetitivas;

public class BucleWhile {
    public void amosarWhile() {
        int i = 0;
        while(i<7){
            System.out.println("Dam1 --> " + (i+1));
            //Adaptamos i al usuario para que el primer valor sea 1 en vez de 0
            i++;
        }
        System.out.println("Fin while\n");
    }
}
