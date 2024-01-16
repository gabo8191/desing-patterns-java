package Singleton;

public class ConexionDB {

    private static ConexionDB conexion;
    private ConexionDB(){

    }

    public synchronized static ConexionDB obtenerConexion(){
        if(conexion == null){
            conexion = new ConexionDB();
            System.out.println("Se ha creado una nueva conexion");
        }
        else {
            System.out.println("Ya existe una conexion");
        }
        return conexion;
    }

}
