package Singleton;

public class Singleton {
    public static void main(String[] args) {
    /*
        ConexionDB conexionDB = ConexionDB.obtenerConexion();
        ConexionDB conexionDB2 = ConexionDB.obtenerConexion();

        System.out.println(conexionDB.hashCode());
        System.out.println(conexionDB2.hashCode());
        */

        //Mediante thread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexionDB = ConexionDB.obtenerConexion();
                System.out.println(conexionDB.hashCode());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexionDB = ConexionDB.obtenerConexion();
                System.out.println(conexionDB.hashCode());
            }
        });

        thread.start();
        thread2.start();
    }
}
