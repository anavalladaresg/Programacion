public class Main {

    public static void main(String[] args) {
        Datos dato1 = Datos.getInstance();
        System.out.println(dato1.getNombre() + ":" + dato1.getEdad());
        Datos dato2 = Datos.getInstance();
        System.out.println(dato2.getNombre() + ":" + dato2.getEdad());
        dato2.setNombre("Ana");
        System.out.println(dato2.getNombre() + ":" + dato2.getEdad());
    }

}
