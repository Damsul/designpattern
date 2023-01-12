package adapter.adapter;

import adapter.cable.CTypeCable;
import adapter.cable.UsbCable;

public class CTypeToUsbAdaptor implements UsbCable {

    private final CTypeCable cTypeCable;

    public CTypeToUsbAdaptor(CTypeCable cTypeCable) {
        this.cTypeCable = cTypeCable;
    }

    @Override
    public String getConnectDeviceName() {
        return cTypeCable.getCTypeConnectDeviceName();
    }
}
