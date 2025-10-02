package co.edu.sena.poo.tema05;

public class Chocolate {
    private String color;

    // firma del metodo derriter(int)
    public void derretir(int gradosCelsius) { // parametros
        if (gradosCelsius >= 30) {
            System.out.println("El chocolate se derrite");
        } else {
            System.out.println("El chocolate no se derrite");
        }
    }

    // firma del metodo mostrarColor()
    public String mostrarColor() {
        return this.color;
    }

    // firma del metodo agregarColor(String)
    public void agregarColor(String color) {
        this.color = color;
    }
}
