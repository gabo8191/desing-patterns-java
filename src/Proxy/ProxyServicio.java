package Proxy;

public class ProxyServicio implements IServicio {

    private IServicio servicio;
    private Usuario usuario;

    public ProxyServicio(IServicio servicio, Usuario usuario) {
        this.servicio = servicio;
        this.usuario = usuario;
    }
    //todos los usuarios pueden leer pero solo los administradores pueden escribir, actualizar y eliminar
    public void leer(){
        this.servicio.leer();
    }

    public void escribir() {
        if (this.usuario.getNivelPermiso() == 5) {
            this.servicio.escribir();
        } else {
            throw new UnsupportedOperationException("No tiene permisos para escribir");
        }
    }

    public void actualizar() {
        if (this.usuario.getNivelPermiso() == 5) {
            this.servicio.actualizar();
        } else {
            throw new UnsupportedOperationException("No tiene permisos para actualizar");
        }
    }

    public void eliminar() {
        if (this.usuario.getNivelPermiso() == 5) {
            this.servicio.eliminar();
        } else {
            throw new UnsupportedOperationException("No tiene permisos para eliminar");
        }
    }


    }

