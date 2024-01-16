package Builder;

public class Usuario {
    private String nombre;
    private String apellido;

    private boolean medioContacto; //si es true, entonces se debe llenar email, telefono y direccion si es false, entonces no se debe llenar nada
    private String email;
    private String telefono;
    private String direccion;

//solo nombre y apellido son obligatorios
    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.medioContacto = false;
        this.email = "";
        this.telefono = "";
        this.direccion = "";
    }
    //una solucion rapida es hacer un constructor para cada cada dato que sea opcional
    //Telescoping constructor: es cuando tienes un constructor con muchos parametros y cada uno es opcional

    public static Usuario make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);
    }

    public BuilderUsuario setMedioContacto(boolean medioContacto) {
        if(!medioContacto){
            throw new IllegalArgumentException("No se puede setear medio de contacto en false");
        }
        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);
    }

    public Usuario build() {
        return this;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Email: " + this.email + "\n" +
                "Telefono: " + this.telefono + "\n" +
                "Direccion: " + this.direccion + "\n";
    }

        public static class BuilderUsuario{
            private Usuario usuario;

            public BuilderUsuario(Usuario usuario){
                this.usuario = usuario;
            }

            public BuilderUsuario setEmail(String email) {
                usuario.email = email;
                return this;
            }


            public BuilderUsuario setTelefono(String telefono) {
                usuario.telefono = telefono;
                return this;
            }

            public BuilderUsuario setDireccion(String direccion) {
                usuario.direccion = direccion;
                return this;
            }

            public Usuario build(){
                return usuario;
            }

        }

}
