package factory.pizza;

public class SweetPotatoPizza implements Pizza {

    @Override
    public void whatIsPizza() {
        System.out.println(getClass().getSimpleName());
    }
}
