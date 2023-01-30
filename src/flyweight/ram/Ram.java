package flyweight.ram;

public class Ram implements RamType{

    String company;
    int volume;

    public Ram(String company) {
        this.company = company;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void info() {
        System.out.println("RAM [company=" + this.company + ", volume=" + this.volume + "]");
    }
}
