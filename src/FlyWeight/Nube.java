package FlyWeight;

public class Nube {
    private TipoNube tipo;
    private int x;
    private int y;
    private String imagen;

    public Nube(TipoNube tipo, int x, int y, String imagen) {
        this.tipo = tipo;
        this.x = x;
        this.y = y;
        this.imagen = imagen;
    }

    public TipoNube getTipo() {
        return tipo;
    }

    public void setTipo(TipoNube tipo) {
        this.tipo = tipo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
