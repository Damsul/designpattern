package adapter.device;

import adapter.cable.CTypeCable;

public class Android implements CTypeCable {

    @Override
    public String getCTypeConnectDeviceName() {
        return getClass().getSimpleName();
    }
}
