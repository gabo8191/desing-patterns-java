package AbstractFactory;

public class AppleStore implements IAbstract{
    @Override
    public Computadora crearComputadora() {
        return new Macbook();
    }

    @Override
    public Tablet crearTablet() {
        return new Ipad();
    }
}
