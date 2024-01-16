package Proxy;

public class Servicio implements IServicio{
    @Override
    public void escribir() {
        System.out.println("Escribiendo...");
    }

    @Override
    public void leer() {
        System.out.println("Leyendo...");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando...");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando...");
    }
}
