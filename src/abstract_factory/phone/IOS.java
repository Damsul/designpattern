package abstract_factory.phone;

public class IOS implements OS{
    @Override
    public void install() {
        System.out.println("IOS 설치중...");
    }
}
