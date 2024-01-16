package SimpleFactory;

public class Pizza {
    private int cantidadRebanadas;

    public Pizza(int cantidadRebanadas) {
        this.cantidadRebanadas = cantidadRebanadas;
    }

    public String toString() {
        return "Pizza de " + this.cantidadRebanadas + " rebanadas";
    }
}
