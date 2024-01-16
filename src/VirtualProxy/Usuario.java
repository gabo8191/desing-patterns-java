package VirtualProxy;

public class Usuario {

    private int nivelPermiso;

    public Usuario(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso; //5 es admin
    }

    public int getNivelPermiso() {
        return nivelPermiso;
    }

    public void setNivelPermiso(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }
}
