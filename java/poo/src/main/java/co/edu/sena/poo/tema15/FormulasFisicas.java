package co.edu.sena.poo.tema15;

public class FormulasFisicas {

    private FormulasFisicas() {
    }

    public static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion; // F = m * a
    }

    public static double calcularEnergiaCinetica(double masa, double velocidad) {
        return 0.5 * masa * Math.pow(velocidad, 2); // KE = 0.5 * m * v^2
    }
}
