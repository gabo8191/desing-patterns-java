package VirtualProxy;

public class ProxyServicio implements IServicio {

    private IServicio servicio; //objeto costoso
    private Usuario usuario;

    public ProxyServicio( Usuario usuario) {

        this.usuario = usuario;
    }
    //todos los usuarios pueden leer pero solo los administradores pueden escribir, actualizar y eliminar
    public void leer(){
        this.getServicio().leer();
    }

    public void escribir() {
        if (this.usuario.getNivelPermiso() == 5) {
            this.getServicio().escribir();
        } else {
            throw new UnsupportedOperationException("No tiene permisos para escribir");
        }
    }

    public void actualizar() {
        if (this.usuario.getNivelPermiso() == 5) {
            this.getServicio().actualizar();
        } else {
            throw new UnsupportedOperationException("No tiene permisos para actualizar");
        }
    }

    public void eliminar() {
        if (this.usuario.getNivelPermiso() == 5) {
            this.getServicio().eliminar();
        } else {
            throw new UnsupportedOperationException("No tiene permisos para eliminar");
        }
    }

    private IServicio getServicio() {
        if (this.servicio == null) {
            this.servicio = new Servicio();
        }
        return servicio;
    } //sirve para crear el objeto costoso solo cuando se necesite

    }

