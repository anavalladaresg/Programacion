public class Main {

    public static void main(String[] args) {

        int[] calificaciones = new int[10];
        int suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = (int)(Math.random() * 11);
            suma += calificaciones[i];
        }

        int media = suma / calificaciones.length;

        System.out.println("La media de las notas es: " + media);

    }

}