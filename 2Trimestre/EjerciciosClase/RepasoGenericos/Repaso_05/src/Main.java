public class Main {
    public static void main(String[] args) {

        Pila<Integer> pilaEnteros = new Pila<>();

        pilaEnteros.push(1);
        pilaEnteros.pop();
        pilaEnteros.peek();

        Pila<String> pilaStrings = new Pila<>();
        pilaStrings.push("hola");
        pilaStrings.pop();
        pilaStrings.peek();
    }
}