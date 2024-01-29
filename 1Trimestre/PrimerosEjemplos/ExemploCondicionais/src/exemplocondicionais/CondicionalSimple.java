package exemplocondicionais;

public class CondicionalSimple {

    public void verMaior(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        }
        // saimos do condicional
    }
    
    public void maiorDeIdade(int num) {
        if(num>=18) {
            System.out.println("Persoa maior de idade");
        }
    }

}
