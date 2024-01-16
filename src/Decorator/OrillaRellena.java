package Decorator;

public class OrillaRellena implements IPizza{
    private IPizza pizza;

    public OrillaRellena(IPizza pizza){
        this.pizza = pizza;
    }

    public String descripcion(){
        return pizza.descripcion() + " con orilla rellena";
    }

    public float precio(){
        return pizza.precio() + 4.00f;
    }
}
