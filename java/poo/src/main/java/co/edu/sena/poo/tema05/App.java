package co.edu.sena.poo.tema05;

public class App {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        chocolate.derretir(25); // el 25 se llama argumento
        chocolate.agregarColor("cafe");
        System.out.println(chocolate.mostrarColor());
    }
}
