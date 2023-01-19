package factory.pizza.sub;

import factory.pizza.Pizza;
import factory.pizza.SweetPotatoPizza;

public class SweetPotatoPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza() {
        return new SweetPotatoPizza();
    }
}
