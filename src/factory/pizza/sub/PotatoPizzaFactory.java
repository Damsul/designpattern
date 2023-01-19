package factory.pizza.sub;

import factory.pizza.Pizza;
import factory.pizza.PotatoPizza;

public class PotatoPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza() {
        return new PotatoPizza();
    }
}
