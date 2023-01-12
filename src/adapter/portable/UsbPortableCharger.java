package adapter.portable;

import adapter.cable.UsbCable;

public class UsbPortableCharger {
    public void charging(UsbCable cable) {
        System.out.println("UsbPortableCharger : " + cable.getConnectDeviceName()+ " USB 충전중...");
    }
}
