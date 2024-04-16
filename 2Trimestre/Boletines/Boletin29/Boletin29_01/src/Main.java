public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int max = Integer.MIN_VALUE;
        int posX = -1, posY = -1;

        // Inicializar el array con valores aleatorios
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                if (array[i][j] > max) {
                    max = array[i][j];
                    posX = i;
                    posY = j;
                }
            }
        }

        // Imprimir el valor máximo y su posición
        System.out.println("El valor máximo es " + max + ", y su posición es (" + posX + ", " + posY + ")");
    }
}