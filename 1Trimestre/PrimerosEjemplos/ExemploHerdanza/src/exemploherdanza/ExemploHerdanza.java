package exemploherdanza;

public class ExemploHerdanza {

    public static void main(String[] args) {
        /*String nom = LerDatos.lerString("Teclea nome: ");
        String ap = LerDatos.lerString("Teclea apelido: ");
        int ed = LerDatos.lerEnteiro("Teclea edade: ");
        float nota = LerDatos.lerFloatPositivo("Teclea nota: ");

        Estudante e1 = new Estudante(nota, nom, ap, ed);
        System.out.println(e1);

        Persoa p1 = new Persoa(LerDatos.lerString("Teclea nome: "),
                LerDatos.lerString("Teclea apelido: "),
                LerDatos.lerEnteiro("Teclea edade: "));
        System.out.println(p1);*/
        
        
        //Instanciamos un estudante tipo Persoa
        Estudante e2 = new Estudante(9, "ana", "valladares", 22);
        System.out.println(e2);
    }

}
