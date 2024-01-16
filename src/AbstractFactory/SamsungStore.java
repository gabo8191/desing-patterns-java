package AbstractFactory;

public class SamsungStore implements IAbstract{
    public Computadora crearComputadora(){
        return new Samsung();
    }
    public Tablet crearTablet(){
        return new GalaxyTab();
    }
}
