package State;

public class State {
    public static void main(String[] args) {
        Auto auto = new Auto();
        /*
        tres estado: Encendido, en movimiento, apagado
        si esta encendido puede estar en movimiento o apagado
        si esta en movimiento puede apagarse o seguir en movimiento pero no encenderse
        si esta apagado puede encenderse o seguir apagado pero no moverse
         */

        auto.apagar();
        auto.acelerar();
    }
}
