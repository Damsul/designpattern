package adapter.device;

import adapter.cable.UsbCable;

public class Mouse implements UsbCable {

    @Override
    public String getConnectDeviceName() {
        return getClass().getSimpleName();
    }
}
