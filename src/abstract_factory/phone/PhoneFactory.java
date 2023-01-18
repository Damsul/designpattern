package abstract_factory.phone;

public interface PhoneFactory {

    Phone createPhone();

    OS createOS();
}
