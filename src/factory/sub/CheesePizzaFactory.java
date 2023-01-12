package factory.sub;

import factory.CheesePizza;
import factory.Pizza;

public class CheesePizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
