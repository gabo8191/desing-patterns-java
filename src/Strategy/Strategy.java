package Strategy;

public class Strategy {
    public static void main(String[] args) {
        //transaccion bancaria:deposito y retiro
        Transaccion transaccion = new Transaccion(new Deposito());
        System.out.println(transaccion.realizarTransaccion(100,200));

        Transaccion transaccion2 = new Transaccion(new Retiro());
        System.out.println(transaccion2.realizarTransaccion(100,200));
    }
}
