public class Main {
    public static void main(String[] args) {

        /**
         * 1. Mostra a lonxitude do texto: “ Esto é  Java!”
         */
        System.out.println("1.");

        String frase = "Esto é Java";
        System.out.println(frase.length());

        /**
         * 2. Desmenuza o String “Java” mostrándoo por pantalla carácter a carácter.
         */
        System.out.println("------x------x------x------ \n2.");

        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }

        /**
         * 3. Investir o texto: “Java desde 0”.
         */
        System.out.println("------x------x------x------ \n3.");

        frase = "Java desde 0";
        frase = new StringBuilder(frase).reverse().toString();
        System.out.println(frase);

        /**
         * 4. Elimina os espazos do texto: “James Gosling Created Xava”.
         */
        System.out.println("------x------x------x------ \n4.");

        frase = "James Gosling Created Xava";
        frase = frase.replace(" ", "");
        System.out.println(frase);

        /**
         * 5. Conta as vocais e as consonantes do String “java java java”. OLLO COS ESPAZOS!
         */
        System.out.println("------x------x------x------ \n5.");

        frase = "java java java";
        int vocales = 0;
        int consonantes = 0;
        frase = frase.replace(" ", "");
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);

        /**
         * 6. Divide a cadea de texto “ www. javadesde0. com” en dous partes “ www. java” e “desde0. com”. Para posteriormente concaténalas e mostralas de novo.
         */
        System.out.println("------x------x------x------ \n6.");

        frase = "www.javadesde0.com";
        String parte1 = frase.substring(0, 9);
        String parte2 = frase.substring(9, frase.length());
        System.out.println(parte1);
        System.out.println(parte2);
        System.out.println(parte1 + parte2);

        /**
         * 7. Transforma a cadea de texto “ javeros” a maiúsculas. Garda o valor na variable e posteriormente convértea novamente a minúsculas.
         */
        System.out.println("------x------x------x------ \n7.");

        frase = "javeros";
        frase = frase.toUpperCase();
        System.out.println(frase);
        frase = frase.toLowerCase();
        System.out.println(frase);

        /**
         * 8. Compara se o String “Java” é igual que o String “ JavaScript”.
         */
        System.out.println("------x------x------x------ \n8.");

        frase = "Java";
        String frase1 = "JavaScript";
        frase = frase.toLowerCase();
        frase1 = frase1.toLowerCase();
        if (frase.equals(frase1)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        /**
         * 9. Sobre a cadea de texto “ Jeve jeve jeve”, substitúe/substitúe todas as vocais e pola vogal para dando como resultado “java java java”.
         */
        System.out.println("------x------x------x------ \n9.");

        frase = "Jeve jeve jeve";
        frase = frase.replace("e", "a");
        System.out.println(frase);

        /**
         * 10. Transforma os caracteres do String: “ ABCD” a ASCII.
         */
        System.out.println("------x------x------x------ \n10.");

        frase = "ABCD";
        frase = "ASCII";
        System.out.println(frase);

        /**
         * 11. Tenta escribir un método, que dado un obxecto da clase String conte diferentes tipos de caracteres.
         * En particular, o método deberá imprimir o número de letras, díxitos e espazos en branco da cadea.
         * Tenta facer un programa que escriba o cálculo (por exemplo) da cadea:
         * «Ola, son alumno de DAM1, e son programador desde o 2021».
         */
        System.out.println("------x------x------x------ \n11.");

        frase = "Ola, son alumno de DAM1, e son programador desde o 2021";
        int letras = 0;
        int digitos = 0;
        int espacios = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                letras++;
            } else if (Character.isDigit(frase.charAt(i))) {
                digitos++;
            } else if (Character.isWhitespace(frase.charAt(i))) {
                espacios++;
            }
        }
        System.out.println("Letras: " + letras);
        System.out.println("Digitos: " + digitos);
        System.out.println("Espacios: " + espacios);
    }
}