package model;

public class Tablero {

    private int tamaño;
    private int[] reinas;

    public Tablero(int tamaño) {
        this.tamaño = tamaño;
        this.reinas = new int[tamaño];
    }

    public int getTamaño() {
        return tamaño;
    }

    public int[] getReinas() {
        return reinas;
    }

    /**
     * Verifica si es seguro colocar una reina en (fila, columna)
     */
    public boolean esSeguro(int fila, int columna) {
        for (int i = 0; i < fila; i++) {

            // Misma columna
            if (reinas[i] == columna) {
                return false;
            }

            // Diagonales
            if (Math.abs(i - fila) == Math.abs(reinas[i] - columna)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Muestra el tablero como en el ejemplo del docente
     */
    public void mostrar() {

        // Códigos ANSI para color
        final String VERDE = "\u001B[32m";
        final String RESET = "\u001B[0m";

        // Encabezado de columnas
        System.out.print("    ");
        for (int j = 0; j < tamaño; j++) {
            System.out.print((char) ('a' + j) + "   ");
        }
        System.out.println();

        // Línea superior
        System.out.print("  +");
        for (int j = 0; j < tamaño; j++) {
            System.out.print("---+");
        }
        System.out.println();

        // Filas
        for (int i = 0; i < tamaño; i++) {

            // Número de fila
            System.out.print((i + 1) + " |");

            for (int j = 0; j < tamaño; j++) {
                if (reinas[i] == j) {
                    System.out.print(" " + VERDE + "Q" + RESET + " |");
                } else {
                    System.out.print(" . |");
                }
            }
            System.out.println();

            // Separador horizontal
            System.out.print("  +");
            for (int j = 0; j < tamaño; j++) {
                System.out.print("---+");
            }
            System.out.println();
        }
    }

}
