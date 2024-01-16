package SimpleFactory;

public class Pizzeria {

    public Pizza crearPizzaPequeña() {
        return new Pizza(6);
    }

    public Pizza crearPizzaMediana() {
        return new Pizza(8);
    }

    public Pizza crearPizzaGrande() {
        return new Pizza(12);
    }

}
