package factory.sub;

import factory.Pizza;

public class Main {

    public static void main(String[] args) {
        AbstractPizzaFactory cheesePizzaFactory = new CheesePizzaFactory();
        Pizza cheesePizza = cheesePizzaFactory.createPizza();
        cheesePizza.whatIsPizza();

        AbstractPizzaFactory potatoPizzaFactory = new PotatoPizzaFactory();
        Pizza potatoPizza = potatoPizzaFactory.createPizza();
        potatoPizza.whatIsPizza();

        AbstractPizzaFactory sweetPotatoPizzaFactory = new SweetPotatoPizzaFactory();
        Pizza sweetPotatoPizza = sweetPotatoPizzaFactory.createPizza();
        sweetPotatoPizza.whatIsPizza();
    }

}
