package co.edu.sena.poo.tema03.atributos.paquete01;

public class Clase01 {
    public int atributo01; // atributo con visibilidad public
    private int atributo02; // atributo con visibilidad private
    protected int atributo03; // atributo con visibilidad protected
    int atributo04; // atributo con visibilidad package


    void metodo01() {
        this.atributo01 = 1;
        this.atributo02 = 2;
        this.atributo03 = 3;
        this.atributo04 = 6;
    }
}
