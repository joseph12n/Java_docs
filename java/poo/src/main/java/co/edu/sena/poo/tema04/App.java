package co.edu.sena.poo.tema04;

public class App {
    public static void main(String[] args) {
        Botella botella1 = new Botella();
        botella1.tipoDeTapa = "rosca";
        botella1.capacidad = 1.5;
        botella1.color = "azul";
        botella1.marca = "Bonafont";

        System.out.println(botella1.color);
        System.out.println(botella1.marca);
        System.out.println(botella1.capacidad);
        System.out.println(botella1.tipoDeTapa);
    }
}
