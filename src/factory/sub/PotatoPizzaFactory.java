package factory.sub;

import factory.Pizza;
import factory.PotatoPizza;

public class PotatoPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza() {
        return new PotatoPizza();
    }
}
