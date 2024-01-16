package Decorator;

public class PizzaPeperoni implements IPizza{

    public String descripcion(){
        return "Pizza de Peperoni";
    }

    public float precio(){
        return 8.00f;
    }
}
