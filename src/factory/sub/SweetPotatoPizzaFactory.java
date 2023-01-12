package factory.sub;

import factory.Pizza;
import factory.SweetPotatoPizza;

public class SweetPotatoPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza() {
        return new SweetPotatoPizza();
    }
}
