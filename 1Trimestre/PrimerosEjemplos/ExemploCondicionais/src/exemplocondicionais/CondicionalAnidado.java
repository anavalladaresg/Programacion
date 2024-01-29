package exemplocondicionais;

public class CondicionalAnidado {

    public void verConAnidados(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " é maior");
        } else if (num1 == num2) {
            System.out.println("Son iguais");
        } else {
            System.out.println(num2 + " é maior");
        }
    }
}
