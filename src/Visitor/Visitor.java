package Visitor;

public class Visitor {
    //fruta 10% de descuento
    //linea blanca 5% de descuento
    public static void main(String[] args) {
        Manzana manzana = new Manzana();
        Lavadora lavadora = new Lavadora();

    System.out.println("Precio manzana: " + manzana.getPrecio());
    System.out.println("Precio lavadora: " + lavadora.getPrecio());

    IVisitor descuentoComun = new DescuentoComun();

    System.out.println("Descuento manzana: " + manzana.accept(descuentoComun));
    System.out.println("Descuento lavadora: " + lavadora.accept(descuentoComun));

    }
}
