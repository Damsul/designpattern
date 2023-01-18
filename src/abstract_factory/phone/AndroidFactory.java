package abstract_factory.phone;

public class AndroidFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        OS os = createOS();
        os.install();
        System.out.println("AndroidPhone 제작 완료.");
        return new AndroidPhone();
    }

    @Override
    public OS createOS() {
        return new GoogleOS();
    }
}
