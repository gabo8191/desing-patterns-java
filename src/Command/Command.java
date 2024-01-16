package Command;

public class Command {
    public static void main(String[] args) {
        IDevice tv = new TV();
        ICommand on = new onDevice(tv);
        ICommand off = new OffDevice(tv);

        on.operacion();
        off.operacion();

    }
}
