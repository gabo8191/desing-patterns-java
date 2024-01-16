package Observer;

public class Observer {
    public static void main(String[] args) {
        Producto aguacate = new Producto(10);
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        Usuario usuario3 = new Usuario(); //no le interesa el aguacate

        aguacate.addObserver(usuario1);
        aguacate.addObserver(usuario2);

        aguacate.venta();



    }
}
