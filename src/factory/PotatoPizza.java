package factory;

public class PotatoPizza implements Pizza {

    @Override
    public void whatIsPizza() {
        System.out.println(getClass().getSimpleName());
    }
}
