package SimpleFactory;

public class SimpleFactory {
    public static void main(String[] args) {
    //normalmnete
        Pizza pizza = new Pizza(8);
        System.out.println(pizza);
    //con  simple factory

        Pizzeria pizzeria = new Pizzeria();
        Pizza pizza2 = pizzeria.crearPizzaMediana();
        System.out.println(pizza2);
    }
    //SIMPLEFACTORY: es un patron de diseño que nos permite crear objetos de un tipo determinado sin tener que conocer la lógica de su creación.
    //En este caso, la clase Pizzeria es la encargada de crear las pizzas, y la clase Pizza es la que representa a las pizzas.
    //La clase Pizzeria tiene un método para crear cada tipo de pizza, y cada método crea una pizza con una cantidad de rebanadas determinada.
}
