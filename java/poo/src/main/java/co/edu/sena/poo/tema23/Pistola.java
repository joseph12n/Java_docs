package co.edu.sena.poo.tema23;

public class Pistola extends Arma{

    private int capacidadCargador;
    public String marca = "Beretta";


    public Pistola(String tipo, String calibre) {
        super(tipo, calibre); // Llama al constructor de la clase padre (Arma)
    }

    public Pistola(String tipo, String calibre, int capacidadCargador) {
        super(tipo, calibre); // Llama al constructor de la clase padre (Arma)
        this.capacidadCargador = capacidadCargador;
    }

    @Override
    public void disparar() {
        System.out.println("Disparando con la pistola de tipo: " + getTipo() + " y calibre: " + getCalibre() + " con capacidad de cargador: " + capacidadCargador);
    }

    public void ejecutarMetodo(){
        this.disparar();
        System.out.println("Marca desde Pistola: " + super.marca);
    }

}
