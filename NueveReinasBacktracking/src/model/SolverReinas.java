package model;

public class SolverReinas {

    private Tablero tablero;
    private int intentos;
    private int retrocesos;

    public SolverReinas(Tablero tablero) {
        this.tablero = tablero;
        this.intentos = 0;
        this.retrocesos = 0;
    }

    public boolean resolver(int fila) {

        if (fila == tablero.getTamaño()) {
            return true;
        }

        for (int columna = 0; columna < tablero.getTamaño(); columna++) {
            intentos++;

            if (tablero.esSeguro(fila, columna)) {
                tablero.getReinas()[fila] = columna;

                if (resolver(fila + 1)) {
                    return true;
                }

                retrocesos++;
            }
        }
        return false;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getRetrocesos() {
        return retrocesos;
    }
}
