package State;

public class Auto implements IEstadoAuto {

    private IEstadoAuto autoEndendido;
    private IEstadoAuto autoApagado;
    private IEstadoAuto autoAcelerando;

    private IEstadoAuto estadoActual;

    public Auto() {
        autoEndendido = new AutoEncender(this);
        autoApagado = new AutoApagar(this);
        autoAcelerando = new AutoAcelerar(this);

        this.estadoActual = this.autoEndendido;
    }
    public void encender() {
        this.estadoActual.encender();
    }

    public void apagar() {
        this.estadoActual.apagar();
    }

    public void acelerar() {
        this.estadoActual.acelerar();
    }

    public IEstadoAuto getAutoEndendido() {
        return autoEndendido;
    }

    public void setAutoEndendido(IEstadoAuto autoEndendido) {
        this.autoEndendido = autoEndendido;
    }

    public IEstadoAuto getAutoApagado() {
        return autoApagado;
    }

    public void setAutoApagado(IEstadoAuto autoApagado) {
        this.autoApagado = autoApagado;
    }

    public IEstadoAuto getAutoAcelerando() {
        return autoAcelerando;
    }

    public void setAutoAcelerando(IEstadoAuto autoAcelerando) {
        this.autoAcelerando = autoAcelerando;
    }

    public IEstadoAuto getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(IEstadoAuto estadoActual) {
        this.estadoActual = estadoActual;
    }
}
