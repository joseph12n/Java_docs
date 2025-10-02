package co.edu.sena.poo.tema01;

public class App {
    public static void main(String[] args) { //
        //Animal animal = new Animal(); no se puede instanciar por ser abstracta
        Perro objeto = new Perro(); //  es una objeto
        System.out.println(objeto);
        Perro perro2 = objeto;
        System.out.println(perro2);

        Perro miPerro = new Perro(); // en lo sobjetos usamos la convencion lowerCamelCase
        System.out.println(miPerro);

    }
}
