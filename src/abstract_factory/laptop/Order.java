package abstract_factory.laptop;

public interface Order {

    LaptopFactory request(String type);

}
