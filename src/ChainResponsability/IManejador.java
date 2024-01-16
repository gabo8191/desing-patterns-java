package ChainResponsability;

public interface IManejador {
    void setNextManejador(IManejador manejador);
    void ejecutarTransaccion(Transaccion transaccion);
}
