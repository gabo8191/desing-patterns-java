package Prototype;

public class Prototype {
    public static void main(String[] args) {
        //primera forma de hacerlo
        Enemigo enemigoBase = new Enemigo("Imagen", 0, 0, 100);
        Enemigo enemigo1 = new Enemigo(enemigoBase);
        Enemigo enemigo2 = new Enemigo(enemigoBase);
        Enemigo enemigo3 = new Enemigo(enemigoBase);

        enemigo1.setPosX(10);
        enemigo2.setPosX(20);
        enemigo3.setPosX(30);

        enemigo1.setVida(50);
        enemigo2.setVida(50);
        enemigo3.setVida(50);

        //segunda forma de hacerlo
        Enemigo enemigoBase2 = new Enemigo("Imagen", 0, 0, 100);
        Enemigo enemigo4 = enemigoBase2.clone();
        Enemigo enemigo5 = enemigoBase2.clone();

        enemigo4.setPosX(10);
        enemigo5.setPosX(20);

    }
}
