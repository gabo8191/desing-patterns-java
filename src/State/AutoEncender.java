package State;

public class AutoEncender implements IEstadoAuto {

    private final Auto auto;

    public AutoEncender(Auto auto) {
        this.auto = auto;
    }

    public void encender() {
        System.out.println("El auto se encendio");
    }

    public void apagar() {
        System.out.println("El auto se apago");
        auto.setEstadoActual(auto.getAutoApagado());
    }

    public void acelerar() {
        System.out.println("El auto esta en movimiento");
        auto.setEstadoActual(auto.getAutoAcelerando());
    }

}
