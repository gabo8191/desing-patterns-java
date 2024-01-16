package Command;

public class onDevice implements ICommand{
    private IDevice device;

    public onDevice(IDevice device) {
        this.device = device;
    }

    @Override
    public void operacion() {
        device.on();
    }
}
