package co.edu.sena.poo.tema22;

public class Mesa {
    private  String descripcion;
    private String marcar;
    private int numeroDePatas;


    public static final class MesaBuilder {
        private String descripcion;
        private String marcar;
        private int numeroDePatas;

        private MesaBuilder() {
        }

        public static MesaBuilder aMesa() {
            return new MesaBuilder();
        }

        public MesaBuilder withDescripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public MesaBuilder withMarcar(String marcar) {
            this.marcar = marcar;
            return this;
        }

        public MesaBuilder withNumeroDePatas(int numeroDePatas) {
            this.numeroDePatas = numeroDePatas;
            return this;
        }

        public Mesa build() {
            Mesa mesa = new Mesa();
            mesa.descripcion = this.descripcion;
            mesa.marcar = this.marcar;
            mesa.numeroDePatas = this.numeroDePatas;
            return mesa;
        }
    }
}
