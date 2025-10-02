package co.edu.sena.poo.tema06;

public class App {
    public static void main(String[] args) {
        Moto moto = new Moto();
        moto.acelerar(); //1
        moto.acelerar(); //2
        moto.acelerar(); //3
        moto.acelerar(); //4
        moto.acelerar(); //5
        moto.acelerar(); //6
        moto.acelerar(); //7
        moto.frenar(); //6
        moto.frenar(); //5
        moto.frenar(); //4
        moto.frenar(); //3
        moto.frenar(); //2
        moto.frenar(); //1
        moto.acelerar();
        System.out.println(moto.obtenerVelocidad());


    }
}
