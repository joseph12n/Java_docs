package co.edu.sena.poo.tema23;

public class Ametralladora extends Arma{

    private int cadenciaDisparo; // Balas por minuto

    public Ametralladora(String tipo, String calibre) {
        super(tipo, calibre); // Llama al constructor de la clase padre (Arma)
    }

    public Ametralladora(String tipo, String calibre, int cadenciaDisparo) {
        super(tipo, calibre); // Llama al constructor de la clase padre (Arma)
        this.cadenciaDisparo = cadenciaDisparo;
    }

    @Override
    public void disparar() {
        System.out.println("Disparando con la ametralladora de tipo: " + getTipo() + " y calibre: " + getCalibre() + " con una cadencia de: " + cadenciaDisparo + " balas por minuto.");
    }
}
