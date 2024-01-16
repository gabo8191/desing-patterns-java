package Visitor;

public class DescuentoComun implements IVisitor {

    @Override
    public float visit(IFruta fruta) {
        // 10% de descuento
        return fruta.getPrecio() * 0.10f;
    }

    @Override
    public float visit(ILineaBlanca lineaBlanca) {
        // 5% de descuento
        return lineaBlanca.getPrecio() * 0.05f;
    }

}
