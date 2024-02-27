public class Metodos implements IComparable {
    /**
     * método genérico encontrarMaximo que acepte un array de tipo T donde T extiende Comparable<T>. Esto asegura que los elementos del array puedan ser comparados entre sí.
     * El método debe retornar el elemento de mayor valor en el array.
     * Si el array está vacío, el método puede retornar null o lanzar una excepción.
     */
    public <T extends Comparable<T>> T encontrarMaximo(T[] array) {
        if (array.length == 0) {
            return null;
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public int compareTo(Object obj) {
        return 0;
    }
}
