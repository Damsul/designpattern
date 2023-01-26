package bridge;

public class RemoteController {
    Device device;

    public RemoteController(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        if (device.getVolume() - 10 < 0) {
            device.setVolume(0);
        } else {
            device.setVolume(device.getVolume() - 10);
        }
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        if (device.getChannel() - 1 < 0) {
            device.setChannel(0);
        } else {
            device.setChannel(device.getChannel() - 1);
        }
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
