package Memento;



public class Memento {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", 25);
        Usuario memento = usuario.getMemento();//copia de usuario
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());

        usuario.setNombre("Pedro");
        usuario.setEdad(30);

        usuario.restaurar(memento);
    }

}
