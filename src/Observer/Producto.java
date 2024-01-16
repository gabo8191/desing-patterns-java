package Observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Producto implements IObservable {
    private int stock;
    private Set<IObserver> observadores;

    public Producto(int stock) {
        this.stock = stock;
        this.observadores = new LinkedHashSet<>();
    }

    public void venta(){
        this.setStock(this.stock - 1);
        //System.out.println("Se ha vendido un producto, ahora hay " + this.stock + " en stock");
        this.notifyObservers();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addObserver(IObserver observer){
        this.observadores.add(observer);
    }

    public void removeObserver(IObserver observer){
        for (IObserver o : this.observadores) {
            if (o.equals(observer)) {
                this.observadores.remove(o);
                break;
            }
        }
    }

    public void notifyObservers(){
        for (IObserver o : this.observadores) {
            o.notificacion("Se ha vendido un producto, ahora hay " + this.stock + " en stock");
        }
    }
}
