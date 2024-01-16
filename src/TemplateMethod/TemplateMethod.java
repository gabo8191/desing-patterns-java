package TemplateMethod;

public class TemplateMethod {
    public static void main(String[] args) {
        Usuario gerente = new Gerente();
        Usuario administrador = new Administrador();

        gerente.autenticacion();
        gerente.formaTrabajar();

        administrador.autenticacion();
        administrador.formaTrabajar();
    }
}
