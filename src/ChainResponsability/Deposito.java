package ChainResponsability;

public class Deposito implements IManejador{
    private IManejador next;
    public void setNextManejador(IManejador next){
        this.next = next;
    }

    public void ejecutarTransaccion(Transaccion transaccion){
        if(transaccion.getTipo() == TipoTransaccion.Deposito){
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El nuevo balance-deposito es: " + cantidad);
        }else{
            this.next.ejecutarTransaccion(transaccion);
        }
    }
}
