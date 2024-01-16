package FlyWeight;

public class FlyWeight {
    public static void main(String[] args) {
        NubeFactory nubeFactory = new NubeFactory();
        for (int i = 0; i < 10; i++) {
            Nube nube = nubeFactory.getNube(TipoNube.Chica);
        }

        for (int i = 0; i < 10; i++) {
            Nube nube = nubeFactory.getNube(TipoNube.Mediana);
        }

        System.out.println("Nubes totales: " + nubeFactory.getNubeCount());
    }
}
