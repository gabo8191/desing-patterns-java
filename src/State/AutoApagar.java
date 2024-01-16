package State;

public class AutoApagar implements IEstadoAuto {

    private final Auto auto;

    public AutoApagar(Auto auto) {
        this.auto = auto;
    }
    public void encender() {
        System.out.println("El auto se encendio");
        auto.setEstadoActual(auto.getAutoEndendido());

    }

    public void apagar() {
        System.out.println("El auto ya esta apagado");
    }

    public void acelerar() {
        System.out.println("El auto no se puede manejar si esta apagado");
    }

}
