package FlyWeight;

import java.util.HashMap;

public class NubeFactory {
    private HashMap<TipoNube, Nube> nubes;

    public NubeFactory() {
        nubes = new HashMap<>();
    }

    public Nube getNube(TipoNube tipo) {
        Nube nube =(Nube) nubes.get(tipo);
        if (nube == null) {
            nube = new Nube(tipo, 0, 0, "nube.png");
            nubes.put(tipo, nube);
        }
        return nube;

    }

    public int getNubeCount() {
        return nubes.size();
    }
}
