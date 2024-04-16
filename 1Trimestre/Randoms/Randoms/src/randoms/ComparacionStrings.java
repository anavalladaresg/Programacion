package randoms;

import javax.swing.JOptionPane;

public class ComparacionStrings {
    public void comparar() {
        String frase1 = JOptionPane.showInputDialog("Introduce el primer String");
        String frase2 = JOptionPane.showInputDialog("Introduce el segundo String");
        
         if (frase1.toLowerCase().equals(frase2.toLowerCase())) {
            System.out.println(frase1 + " y " + frase2 + " dicen lo mismo.");
        } else {
            System.out.println("Estás comparando elementos diferentes.");
        }
    }
}
