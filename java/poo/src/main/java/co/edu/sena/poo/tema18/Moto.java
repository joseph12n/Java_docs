package co.edu.sena.poo.tema18;

public class Moto extends Vehiculo{
    @Override
    public void andar(){
        System.out.println("La moto esta andando en 2 ruedas");
    }

    @Override
    public void encender(){
        System.out.println("La moto se enciende con el pedal");
    }

    public final void frenar(){
        System.out.println("La moto esta frenando");
    }
}
