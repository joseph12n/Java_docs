package co.edu.sena.poo.tema07;

public class App {
    public static void main(String[] args) {
        Camion camion = new Camion();
        camion.setMarca("Ford");
        camion.setModelo("F-150");
        camion.setCarga(1000);
        camion.setVelocidad(80);
        System.out.println("Marca: " + camion.getMarca());
        System.out.println("Modelo: " + camion.getModelo());
        System.out.println("Carga: " + camion.getCarga() + " kg");
        System.out.println("Velocidad: " + camion.getVelocidad() + " km/h");
    }
}
