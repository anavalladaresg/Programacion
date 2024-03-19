public class Main {
    public static void main(String[] args) {
        Caja<Integer> cajaInt = new Caja<>();
        cajaInt.setObjeto(123);
        System.out.println("Valor en cajaInt: " + cajaInt.getObjeto());

        Caja<String> cajaStr = new Caja<>();
        cajaStr.setObjeto("Hello world");
        System.out.println("Valor en cajaStr: " + cajaStr.getObjeto());
    }
}