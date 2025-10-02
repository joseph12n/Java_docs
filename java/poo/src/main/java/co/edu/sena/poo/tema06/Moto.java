package co.edu.sena.poo.tema06;

public class Moto {
    private int velocidad ;

    public void acelerar() {
        if (this.velocidad >= 0) {
            this.velocidad += 1;
        }
    }

    public int obtenerVelocidad() {
        return this.velocidad;
    }

    public void frenar() {
        if (this.velocidad > 0) {
            this.velocidad -= 1;
        } else
            System.out.println("No se puede frenar");
    }
}
