package Builder;

public class Builder {
    public static void main(String[] args) {
        Usuario usuario = Usuario.make("Juan", "Perez").build();

        //Usuario usuario2 = Usuario.make("Juan", "Perez")
                //.setEmail("juan@gmail.com").setTelefono("123456789").build();

        //Usuario usuario3 = Usuario.make("Juan", "Perez").setDireccion("Calle 123").build();


        System.out.println(usuario);
        //System.out.println(usuario2);
        //System.out.println(usuario3);

        Usuario usuario2 = Usuario.make("Juan", "Perez").setMedioContacto(true).setEmail("hola@gola").build();
        System.out.println(usuario2);
        Usuario usuario3 = Usuario.make("jj", "Perez").setMedioContacto(false).build();
        System.out.println(usuario3);


    }
}
