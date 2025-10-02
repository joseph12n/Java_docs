package co.edu.sena.poo.tema16.paquete01;

public class Gato extends Animal {

    public void metodo(){
        this.atributo02 = "valor";
        this.atributo03 = "valor";
        this.atributo04 = "valor";

        this.metodo01(); // public
        this.metodo03(); // protected
        this.metodo04(); // default
    }
}
