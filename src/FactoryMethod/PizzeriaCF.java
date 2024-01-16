package FactoryMethod;

public class PizzeriaCF implements Pizzeria {

    @Override
    public Pizza crearPizza(String tipo) {
        Pizza pizza = null;
        if (tipo.equals("vegetariana")) {
            pizza = new Pizza(8, "vegetariana");
        } else if (tipo.equals("peperoni")) {
            pizza = new Pizza(8, "peperoni");
        } else if (tipo.equals("queso")) {
            pizza = new Pizza(8, "queso");
        } else if (tipo.equals("peperoni orilla rellena")){
            pizza = new PizzaOrillaRellena(12, "peperoni");
        } else if (tipo.equals("queso orilla rellena")){
            pizza = new PizzaOrillaRellena(8, "queso");
        }

        return pizza;
    }
}
