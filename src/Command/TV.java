package Command;

public class TV implements IDevice{
    private boolean on = false;

    @Override
    public void on() {
        on = true;
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        on = false;
        System.out.println("TV is off");
    }
}
