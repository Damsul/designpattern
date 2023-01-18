package abstract_factory.laptop;

public class MacOS implements OS{
    @Override
    public void install() {
        System.out.println("MacOS 설치!");
    }
}