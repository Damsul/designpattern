package adapter.portable;

import adapter.cable.CTypeCable;

public class CTypePortableCharger {

    public void charging(CTypeCable cable) {
        System.out.println(
            "CTypePortableCharger : " + cable.getCTypeConnectDeviceName() + " CType 충전중");
    }
}
