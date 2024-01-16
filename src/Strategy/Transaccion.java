package Strategy;

public class Transaccion {
    private IStrategy estrategia;

    public Transaccion(IStrategy estrategia){
        this.estrategia = estrategia;
    }

    public float realizarTransaccion(float balance, float cantidad){
        return this.estrategia.realiarOperacion(balance, cantidad);
    }
}
