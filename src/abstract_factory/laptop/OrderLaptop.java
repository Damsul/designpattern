package abstract_factory.laptop;

public class OrderLaptop implements Order{
    @Override
    public LaptopFactory request(String type) {
        switch (type) {
            case "LgGram":
                return new LgGramFactory();
            case "MacBook":
                return new MacBookFactory();
        }
        throw new IllegalArgumentException("Non-existent laptop");
    }
}