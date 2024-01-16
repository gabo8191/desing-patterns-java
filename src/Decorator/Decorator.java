package Decorator;

public class Decorator {

    public static void main(String[] args) {
    IPizza pizzaPeperoni = new PizzaPeperoni();
        System.out.println(pizzaPeperoni.descripcion());
        System.out.println(pizzaPeperoni.precio());

        IPizza pizzaHawaiana = new PizzaHawaiana();
        System.out.println(pizzaHawaiana.descripcion());
        System.out.println(pizzaHawaiana.precio());
        //queso extra 2 dolareas adicionales
        //pudenen o no pueden tener orilla de queso 4 dolares adicionales
        IPizza pizzaPeperoniConQuesoExtra = new QuesoExtra(pizzaPeperoni);
        System.out.println(pizzaPeperoniConQuesoExtra.descripcion());
        System.out.println(pizzaPeperoniConQuesoExtra.precio());

        IPizza pizzaHawaianaConQuesoExtra = new QuesoExtra(new OrillaRellena(pizzaHawaiana));
        System.out.println(pizzaHawaianaConQuesoExtra.descripcion());
        System.out.println(pizzaHawaianaConQuesoExtra.precio());
    }

}
