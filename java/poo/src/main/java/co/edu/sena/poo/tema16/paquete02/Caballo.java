package co.edu.sena.poo.tema16.paquete02;

import co.edu.sena.poo.tema16.paquete01.Animal;

public class Caballo extends Animal {

    public void metodo(){
        this.atributo02 = "valor"; // atributo public
        this.atributo03 = "valor"; // atributo protected


        this.metodo01(); // metodo public
        this.metodo03(); // metodo protected
    }
}
