package State;

public class AutoAcelerar implements IEstadoAuto {

    private final Auto auto;

    public AutoAcelerar(Auto auto) {
        this.auto = auto;
    }
    public void encender() {
        System.out.println("El auto ya esta encendido");
    }

    public void apagar() {
        System.out.println("El auto se apago");
        auto.setEstadoActual(auto.getAutoApagado());
    }

    public void acelerar() {
        System.out.println("El auto ya esta en movimiento");
    }

}
