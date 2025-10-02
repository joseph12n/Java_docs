package co.edu.sena.poo.tema12;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public float sumar(float a, float b) {
        return a + b;
    }

    public int sumar(short a, short b) {
        return a+b;
    }



    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return (double) a / b;
    }
}
