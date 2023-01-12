package adapter.adapter;

import adapter.cable.CTypeCable;
import adapter.cable.LightningCable;

public class LightningToCTypeAdaptor implements CTypeCable {

    private final LightningCable lightningCable;
    public LightningToCTypeAdaptor(LightningCable lightningCable) {
        this.lightningCable = lightningCable;
    }

    @Override
    public String getCTypeConnectDeviceName() {
        return lightningCable.getLightningConnectDeviceName();
    }
}
