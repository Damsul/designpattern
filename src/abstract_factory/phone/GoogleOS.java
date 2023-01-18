package abstract_factory.phone;

public class GoogleOS implements OS{
    @Override
    public void install() {
        System.out.println("GoogleOS 설치중...");
    }
}
