package app;

import model.Tablero;
import model.SolverReinas;

public class Main {

    public static void main(String[] args) {

        int N = 9;

        System.out.println("Resolviendo el problema de las " + N + " Reinas...\n");

        Tablero tablero = new Tablero(N);
        SolverReinas solver = new SolverReinas(tablero);

        if (solver.resolver(0)) {
            System.out.println("Solución encontrada:\n");
            tablero.mostrar();
            System.out.println("\nIntentos realizados: " + solver.getIntentos());
            System.out.println("Retrocesos realizados: " + solver.getRetrocesos());
        } else {
            System.out.println("No se encontró una solución.");
        }
    }
}
