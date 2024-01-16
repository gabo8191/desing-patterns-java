package Iterator;

public class Iterator {
    public static void main(String[] args) {
        GuiaTelefonica guia = new GuiaTelefonica();
        guia.add("123456789");
        guia.add("987654321");
        guia.add("123456789");
        Iterador iterador = new IteradorGuia(guia);
        while (iterador.tieneSiguiente()) {
            System.out.println(iterador.siguiente());
        }
    }
}
