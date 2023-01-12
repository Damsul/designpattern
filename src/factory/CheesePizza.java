package factory;

public class CheesePizza implements Pizza {

    @Override
    public void whatIsPizza() {
        System.out.println(getClass().getSimpleName());
    }
}
