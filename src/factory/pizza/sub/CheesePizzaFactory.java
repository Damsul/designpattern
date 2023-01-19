package factory.pizza.sub;

import factory.pizza.CheesePizza;
import factory.pizza.Pizza;

public class CheesePizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
