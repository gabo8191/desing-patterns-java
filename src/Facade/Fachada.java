package Facade;

public class Fachada {
    private Computadora computadora;

    public Fachada() {
        ITeclado teclado = new Teclado();
        IMouse mouse = new Mouse();
        computadora = new Computadora(mouse, teclado);
    }

    public void encender() {
        computadora.encender();
    }
}
