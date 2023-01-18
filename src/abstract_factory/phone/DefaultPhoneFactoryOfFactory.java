package abstract_factory.phone;

public class DefaultPhoneFactoryOfFactory implements PhoneFactoryOfFactory{

    @Override
    public PhoneFactory requestPhone(String type) {
        switch (type) {
            case "ANDROID":
                return new AndroidFactory();
            case "IPHONE":
                return new IPhoneFactory();
        }
        throw new IllegalArgumentException();
    }
}
