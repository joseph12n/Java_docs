package co.edu.sena.poo.tema23;

public class Arma {
    private String tipo;
    private String calibre;
    public String marca = "Glock";

    public Arma(String tipo, String calibre) {
        this.tipo = tipo;
        this.calibre = calibre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public void disparar() {
        System.out.println("Disparando con el arma de tipo: " + tipo + " y calibre: " + calibre);
    }
}
