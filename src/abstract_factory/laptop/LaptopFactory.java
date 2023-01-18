package abstract_factory.laptop;

public interface LaptopFactory {
    Laptop createLaptop();
    OS createOS();
}