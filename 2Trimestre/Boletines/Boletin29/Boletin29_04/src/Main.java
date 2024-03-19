import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce el primer número:");
            double num1 = scanner.nextDouble();

            System.out.println("Introduce el segundo número:");
            double num2 = scanner.nextDouble();

            double result = num1 / num2;
            System.out.println("El resultado de la división es: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, introduce un número.");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }
    }
}