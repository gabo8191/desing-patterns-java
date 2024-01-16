package ChainResponsability;

public class Reembolso implements IManejador{

    private IManejador next;
    public void setNextManejador(IManejador next){
        this.next = next;
    }
    public void ejecutarTransaccion(Transaccion transaccion){
        if(transaccion.getTipo() == TipoTransaccion.Reembolso){
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El nuevo balance-reembolso es: " + cantidad);
        }else{
            System.out.println("Transaccion no valida");
        }
    }
}
