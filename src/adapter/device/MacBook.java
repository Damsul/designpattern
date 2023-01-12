package adapter.device;

import adapter.cable.CTypeCable;

public class MacBook implements CTypeCable {

    @Override
    public String getCTypeConnectDeviceName() {
        return getClass().getSimpleName();
    }
}
