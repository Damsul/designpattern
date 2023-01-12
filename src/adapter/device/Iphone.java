package adapter.device;

import adapter.cable.LightningCable;

public class Iphone implements LightningCable {

    @Override
    public String getLightningConnectDeviceName() {
        return getClass().getSimpleName();
    }
}
