import java.util.Random;

public class Tablero {

    int[][] tablero = new int[8][8];

    String[] piezas = {"torre", "caballo", "alfil", "reina", "rey", "alfil", "caballo", "torre", "peon", "peon", "peon", "peon", "peon", "peon", "peon", "peon"};

    // Método que coloca aleatoriamente las piezas en el tablero
    public void colocarPiezasAleatorias() {
        // Llenar el tablero con espacios (0 representa espacio vacío)
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = 0;
            }
        }

        // Colocar las piezas en el tablero
        Random rand = new Random();
        int piezasColocadas = 0;

        while (piezasColocadas < 32) { // 32 piezas ya que se repiten 2 veces
            int fila = rand.nextInt(8);
            int columna = rand.nextInt(8);

            // Verificar si la casilla está vacía
            if (tablero[fila][columna] == 0) {
                // Colocar la pieza aleatoria en la casilla
                tablero[fila][columna] = piezasColocadas % 16; // Utilizar directamente el índice de la pieza

                piezasColocadas++;
            }
        }
    }

    // Método que imprime el tablero lleno con las piezas
    public void imprimirTablero() {
        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print(" |");
                } else {
                    System.out.print(piezas[tablero[i][j]] + "|");
                }
            }
            System.out.println("");
        }
    }
}