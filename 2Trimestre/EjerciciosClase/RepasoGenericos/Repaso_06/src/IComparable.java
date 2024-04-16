/**
 * Clase generica que permite que un array sea de cualquier tipo que sea comparable
 * @param <T>
 */
public interface IComparable<T> {
    /**
     * Metodo que compara dos elementos
     * @param obj
     * @return
     */
    public int compareTo(T obj);
}
