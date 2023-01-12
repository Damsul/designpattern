package adapter.adapter;

import adapter.cable.CTypeCable;
import adapter.cable.UsbCable;
import adapter.device.Mouse;

public class UsbToCTypeAdaptor implements CTypeCable {

    private final UsbCable usbCable;
    public UsbToCTypeAdaptor(UsbCable usbCable) {
        this.usbCable = usbCable;
    }

    @Override
    public String getCTypeConnectDeviceName() {
        return usbCable.getConnectDeviceName();
    }
}
