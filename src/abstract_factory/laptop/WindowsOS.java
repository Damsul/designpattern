package abstract_factory.laptop;

public class WindowsOS implements OS{
    @Override
    public void install() {
        System.out.println("Windows 설치!");
    }
}