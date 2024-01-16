package ChainResponsability;

public class Retiro implements IManejador{

    private IManejador next;
    public void setNextManejador(IManejador next){
        this.next = next;
    }
    public void ejecutarTransaccion(Transaccion transaccion){
        if(transaccion.getTipo() == TipoTransaccion.Retiro){
            float cantidad = transaccion.getBalance() - transaccion.getCantidad();
            System.out.println("El nuevo balance-retiro es: " + cantidad);
        }else{
            this.next.ejecutarTransaccion(transaccion);
        }
    }
}
