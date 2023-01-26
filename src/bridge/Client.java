package bridge;

public class Client {
    public static void main(String[] args) {
        Device tv = new Tv();
        RemoteController tvRemoteController = new AdvancedRemoteController(tv);

        tvRemoteController.togglePower();
        tvRemoteController.togglePower();
        tvRemoteController.volumeDown();
        tvRemoteController.volumeUp();
        tvRemoteController.channelUp();
        tvRemoteController.channelDown();

        System.out.println("===============");

        Device radio = new Radio();
        AdvancedRemoteController radioRemoteController = new AdvancedRemoteController(radio);

        radioRemoteController.togglePower();
        radioRemoteController.togglePower();
        radioRemoteController.volumeDown();
        radioRemoteController.volumeUp();
        radioRemoteController.channelDown();
        radioRemoteController.channelUp();
        radioRemoteController.mute();
    }

}
