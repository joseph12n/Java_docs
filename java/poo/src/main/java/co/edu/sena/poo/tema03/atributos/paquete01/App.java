package co.edu.sena.poo.tema03.atributos.paquete01;

public class App {
    public static void main(String[] args) {
        Clase01 objeto = new Clase01();
        objeto.atributo01 = 1; //public
        objeto.atributo03 = 6; //protected
        objeto.atributo04 = 2; //package
        System.out.println(objeto.atributo01);
    }
}
