package Prototype;

public class Enemigo {
    private String imagen;
    private int posX;
    private int posY;
    private int vida;

    public Enemigo(String imagen, int posX, int posY, int vida) {
        this.imagen = imagen;
        this.posX = posX;
        this.posY = posY;
        this.vida = vida;
    }
//primera forma de hacerlo
    public Enemigo(Enemigo enemigo) {
        this.imagen = enemigo.getImagen();
        this.posX = enemigo.getPosX();
        this.posY = enemigo.getPosY();
        this.vida = enemigo.getVida();
    }

    //segunda forma de hacerlo
    public Enemigo clone() {
        return new Enemigo(this.imagen, this.posX, this.posY, this.vida);
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
