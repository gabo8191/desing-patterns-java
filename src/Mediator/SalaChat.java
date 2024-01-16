package Mediator;

import java.util.HashMap;

public class SalaChat {
    private HashMap<String, Usuario> usuarios;

    public SalaChat() {
        usuarios = new HashMap<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNombre(), usuario);
    }

    public void enviarMensaje(Usuario remitente, Usuario destinatario, String mensaje) {

        if(this.usuarios.get(remitente.getNombre()) != null && this.usuarios.get(destinatario.getNombre()) != null) {
            mensaje = "De: " + remitente.getNombre() + "\n" + mensaje;
            destinatario.recibirMensaje(mensaje);
        } else {
            System.out.println("El usuario no existe");
        }
    }
}
