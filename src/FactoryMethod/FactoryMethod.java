package FactoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        Pizzeria pizzeria = new PizzeriaCF();
        Pizza pizza = pizzeria.crearPizza("vegetariana");
        System.out.println(pizza);
        Pizza pizza1 = pizzeria.crearPizza("peperoni orilla rellena");
        System.out.println(pizza1);
    }
}
