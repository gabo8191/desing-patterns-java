package Facade;

public class Computadora {
    private IMouse mouse;
    private ITeclado teclado;

    public Computadora(IMouse mouse, ITeclado teclado) {
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public void encender() {
        System.out.println("Encendiendo la computadora");
        this.mouse.conectar();
        this.teclado.conectar();
    }

}
