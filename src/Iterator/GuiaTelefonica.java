package Iterator;

import java.util.ArrayList;

public class GuiaTelefonica {
    private ArrayList<String> numeros;

    public GuiaTelefonica() {
        this.numeros = new ArrayList<String>();
    }

    public void add(String numero) {
        numeros.add(numero);
    }

    public ArrayList<String> getNumeros() {
        return numeros;
    }
}
