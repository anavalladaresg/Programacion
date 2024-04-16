package usolibraria;

public class UsoLibraria {

    public static void main(String[] args) {
        int dato = LerDatos.lerEnteiro("teclea dato");
        System.out.println(dato);
        // o también
        System.out.println("Dato: " + LerDatos.lerEnteiro("Teclea dato:"));
    }

}
