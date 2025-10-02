package co.edu.sena.poo.tema04.referencia;

import co.edu.sena.poo.tema01.Perro;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        System.out.println("Tipo de dato referencia");
        String cadena = "Hola Mundo";
        System.out.println(cadena);

        Perro miPerro = new Perro();
        System.out.println(miPerro);

        int [] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        System.out.println(a.getClass().getCanonicalName());

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

    }
}
