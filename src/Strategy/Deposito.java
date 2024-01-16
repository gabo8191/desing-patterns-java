package Strategy;

public class Deposito implements IStrategy{
    @Override
    public float realiarOperacion(float balance, float cantidad) {
        return balance + cantidad;
    }
}
