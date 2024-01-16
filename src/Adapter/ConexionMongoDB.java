package Adapter;

public class ConexionMongoDB implements IConexionNoSQL {
    public void conexion() {
        System.out.println("Conexión con MongoDB");
    }

public String executeSentence() {
        return "Consulta MongoDB";
    }
}
