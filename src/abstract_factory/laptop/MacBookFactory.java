package abstract_factory.laptop;

public class MacBookFactory implements LaptopFactory{
    @Override
    public Laptop createLaptop() {
        OS os = createOS();
        os.install();
        System.out.println("맥북 제작 완료!");
        return new MacBook();
    }

    @Override
    public OS createOS() {
        return new MacOS();
    }
}