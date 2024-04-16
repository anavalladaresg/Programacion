import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        for (String item : list) {
            System.out.println(item);
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value == 2) { // Cambia este valor al que quieras eliminar
                iterator.remove();
            }
        }
    }

}