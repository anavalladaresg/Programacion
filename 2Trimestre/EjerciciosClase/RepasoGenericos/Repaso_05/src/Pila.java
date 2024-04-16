import java.util.ArrayList;

/**
 * Clase genérica que implementa una estructura de datos tipo pila.
 * @author Ana
 * version 1.0
 */
public class Pila <T> {

    private ArrayList<T> lista = new ArrayList<>();

    /**
     * Método que inicializa la pila.
     * @param elemento
     */
    public void push(T elemento) {
        lista.add(elemento);
    }

    /**
     * Método que elimina el último elemento de la pila y lo devuelve.
     *
     */
    public T pop() {
        if (lista.isEmpty()) {
            throw new NullPointerException("La pila está vacía");
        }
        return lista.remove(lista.size() - 1);
    }

    /**
     * Método que devuelve el último elemento de la pila sin eliminarlo. si esta vacía devuelve null.
     */
    public T peek() {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(lista.size() - 1);
    }

    /**
     * Método que devuelve true si la pila está vacía, si no devuelve false.
     */
    public boolean estaVacia() {
        return lista.isEmpty();
    }
}
