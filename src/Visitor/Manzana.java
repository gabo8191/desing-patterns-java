package Visitor;

public class Manzana implements IFruta, Visitable{

        @Override
        public float getPrecio() {
            return 10;
        }

        public float accept(IVisitor visitor){
            return visitor.visit(this);
        }
}
