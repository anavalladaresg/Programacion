public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Integer[] arrayInt = {1, 2, 3, 4, 5};
        String[] arrayStr = {"hola", "adios", "hasta luego", "hasta pronto"};
        System.out.println(metodos.encontrarMaximo(arrayInt));
        System.out.println(metodos.encontrarMaximo(arrayStr));
    }
}