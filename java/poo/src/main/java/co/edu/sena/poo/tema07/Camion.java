package co.edu.sena.poo.tema07;

public class Camion {
    private int velocidad;
    private int carga;
    private String marca;
    private String modelo;

    // getter
    public int getVelocidad() {
        return this.velocidad;
    }

    // setter
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
