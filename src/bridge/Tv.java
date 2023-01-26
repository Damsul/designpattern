package bridge;

public class Tv implements Device {

    boolean flag;
    int volume;
    int channel;


    @Override
    public boolean isEnabled() {
        return flag;
    }

    @Override
    public void enable() {
        System.out.println("Tv On");
        flag = true;
    }

    @Override
    public void disable() {
        System.out.println("Tv Off");
        flag = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("Tv volume : " + volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Tv channel : " + channel);
    }
}
