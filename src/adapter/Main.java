package adapter;

import adapter.adapter.CTypeToUsbAdaptor;
import adapter.adapter.LightningToCTypeAdaptor;
import adapter.adapter.UsbToCTypeAdaptor;
import adapter.device.Android;
import adapter.device.Iphone;
import adapter.device.MacBook;
import adapter.device.Mouse;
import adapter.portable.CTypePortableCharger;
import adapter.portable.UsbPortableCharger;

public class Main {

    public static void main(String[] args) {

        Android android = new Android();
        Iphone iphone = new Iphone();

        CTypePortableCharger cTypePortableCharger = new CTypePortableCharger();
        cTypePortableCharger.charging(android);
        cTypePortableCharger.charging(new LightningToCTypeAdaptor(iphone));

    }
}


/*MacBook macBook = new MacBook(); // C-Type
        Iphone iphone = new Iphone(); // 8-pin
        Android android = new Android(); // C-Type
        Mouse mouse = new Mouse(); // USB



        UsbPortableCharger usbPortableCharger = new UsbPortableCharger();
        CTypePortableCharger cTypePortableCharger = new CTypePortableCharger();

        // device - cable - portable
        usbPortableCharger.charging(mouse);
        cTypePortableCharger.charging(android);
        cTypePortableCharger.charging(macBook);

        // usb -> c-type
        cTypePortableCharger.charging(new UsbToCTypeAdaptor(mouse));

        // c-type -> usb
        usbPortableCharger.charging(new CTypeToUsbAdaptor(android));
        usbPortableCharger.charging(new CTypeToUsbAdaptor(macBook));



        // 8-pin -> c-type -> usb
        usbPortableCharger.charging(new CTypeToUsbAdaptor(new LightningToCTypeAdaptor(iphone)));*/