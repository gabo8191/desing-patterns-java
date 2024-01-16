package AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        SamsungStore samsungStore = new SamsungStore();
        AppleStore appleStore = new AppleStore();

        Computadora macbook = appleStore.crearComputadora();
        Computadora samsung = samsungStore.crearComputadora();

        Tablet ipad = appleStore.crearTablet();
        Tablet galaxyTab = samsungStore.crearTablet();
    }
}
