package Iterator;

public class IteradorGuia implements Iterador{

private GuiaTelefonica guia;
    private int posicion;
    private GuiaTelefonica guiaTelefonica;

    public IteradorGuia(GuiaTelefonica guia) {
        this.guia = guia;
    }

    @Override
    public String siguiente() {
        return this.guia.getNumeros().get(posicion++);
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < this.guia.getNumeros().size()&& this.guia.getNumeros().get(posicion)!=null;
    }

}
