package co.edu.sena.poo.tema22;

public class App {
    public static void main(String[] args) {
        Puerta puerta = new Puerta();
        System.out.println(puerta);

        Mesa mesa = Mesa.MesaBuilder.aMesa()
                .withDescripcion("Mesa de comedor")
                .withMarcar("IKEA")
                .withNumeroDePatas(4)
                .build();
        System.out.println(mesa);
    }

    public void metodo(Puerta puerta){
        System.out.println(puerta);
    }
}
