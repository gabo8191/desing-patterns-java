package Strategy;

public class Retiro implements IStrategy {
    @Override
    public float realiarOperacion(float balance, float cantidad) {
        return balance - cantidad;
    }
}
