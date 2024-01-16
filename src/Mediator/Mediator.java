package Mediator;

public class Mediator {
    public static void main(String[] args) {
        Usuario eduardo = new Usuario("Eduardo");
        Usuario maria = new Usuario("Maria");

        SalaChat sala = new SalaChat();
        sala.agregarUsuario(eduardo);
        sala.agregarUsuario(maria);

        sala.enviarMensaje(eduardo, maria, "Hola Maria");
    }
}
