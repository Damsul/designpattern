package bridge;

public class Radio implements Device {

    boolean flag;
    int volume;
    int channel;


    @Override
    public boolean isEnabled() {
        return flag;
    }

    @Override
    public void enable() {
        System.out.println("Radio On");
        flag = true;
    }

    @Override
    public void disable() {
        System.out.println("Radio Off");
        flag = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("Radio volume : " + volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Radio channel : " + channel);
    }
}
