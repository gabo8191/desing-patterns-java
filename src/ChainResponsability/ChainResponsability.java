package ChainResponsability;

public class ChainResponsability {
    public static void main(String[] args) {
        Transaccion transaccion = new Transaccion(100, 100, TipoTransaccion.Cheque);
        IManejador manejadorDeposito = new Deposito();
        IManejador manejadorRetiro = new Retiro();
        IManejador manejadorReembolso = new Reembolso();

        manejadorDeposito.setNextManejador(manejadorRetiro);
        manejadorRetiro.setNextManejador(manejadorReembolso);

        manejadorDeposito.ejecutarTransaccion(transaccion);

    }
}
