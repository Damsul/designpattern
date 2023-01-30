package flyweight.ram;

public class Client {

    public static void main(String[] args) {
        String[] companies = {"Samsung", "Hynix", "Micron"};
        int[] volumes = {4, 8, 16, 32};

        for (int i = 0; i < 10; i++) {
            Ram ram = RamFactory.manufactureRam(companies[(int) (Math.random() * 3)]);
            ram.setVolume(volumes[(int) (Math.random() * 4)]);
            ram.info();
        }

    }

}
