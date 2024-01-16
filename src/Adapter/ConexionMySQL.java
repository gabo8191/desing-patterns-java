package Adapter;

public class ConexionMySQL implements IConexionSQL {

    @Override
    public void conexion() {
        System.out.println("Conexión con MySQL");
    }

    @Override
    public String runQuery() {
        return "Consulta MySQL";
    }

}

