package TemplateMethod;

public abstract class Usuario {

    public void autenticacion(){
        System.out.println("TODOS LOS USUARIOS DEBEN AUTENTICARSE");
    }

    abstract void formaTrabajar();
}
