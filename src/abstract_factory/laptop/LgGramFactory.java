package abstract_factory.laptop;

public class LgGramFactory implements LaptopFactory{
    @Override
    public Laptop createLaptop() {
        OS os = createOS();
        os.install();
        System.out.println("Lg 그램 제작 완료!");
        return new LgGram();
    }

    @Override
    public OS createOS() {
        return new WindowsOS();
    }
}