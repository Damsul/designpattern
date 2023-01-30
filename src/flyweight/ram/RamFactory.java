package flyweight.ram;

import java.util.HashMap;

public class RamFactory {

    private static final HashMap<String, Ram> ramMap = new HashMap<>();

    public static Ram manufactureRam(String company) {
        Ram ram = ramMap.get(company);

        if (ram == null) {
            ram = new Ram(company);
            ramMap.put(company, ram);
            System.out.println("====새로운 RAM 제조 : " + company + " company====");
        }

        return ram;
    }

}
