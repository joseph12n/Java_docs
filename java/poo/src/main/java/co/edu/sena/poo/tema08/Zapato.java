package co.edu.sena.poo.tema08;

public class Zapato {
    private String marca;
    private String color;
    private String talla;


    public Zapato() {
    }

    public Zapato(String marca, String color, String talla) {
        this.marca = marca;
        this.color = color;
        this.talla = talla;
    }

    public Zapato(String color, String talla){
        this.color = color;
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}