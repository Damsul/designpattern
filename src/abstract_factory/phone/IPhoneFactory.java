package abstract_factory.phone;

public class IPhoneFactory implements PhoneFactory {


    @Override
    public Phone createPhone() {
        OS os = createOS();
        os.install();
        System.out.println("IPhone 제작 완료.");
        return new IPhone();
    }

    @Override
    public OS createOS() {
        return new IOS();
    }
}
