public class Utilidades {
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5};
        Utilidades.imprimirArray(numeros);

        String[] palabras = {"Hola", "Mundo", "Java"};
        Utilidades.imprimirArray(palabras);
    }
}