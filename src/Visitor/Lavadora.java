package Visitor;

public class Lavadora implements ILineaBlanca, Visitable{

            @Override
            public float getPrecio() {
                return 100;
            }

            public float accept(IVisitor visitor){
                return visitor.visit(this);
            }
}
