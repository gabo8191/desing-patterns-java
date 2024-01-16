package Proxy;

public class Proxy {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(2);
        IServicio servicio = new ProxyServicio(new Servicio(), usuario);

        servicio.leer();
        servicio.escribir();
        servicio.actualizar();
        servicio.eliminar();

        //unicamente los administradores pueden eliminar, actualizar y escribir

    }
}
