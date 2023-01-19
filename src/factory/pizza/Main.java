package factory.pizza;

public class Main {

    public static void main(String[] args) {

        PizzaFactory factory = new PizzaFactory();

        Pizza cheesePizza = factory.createPizza(Topping.CHEESE);
        cheesePizza.whatIsPizza();

        Pizza potatoPizza = factory.createPizza(Topping.POTATO);
        potatoPizza.whatIsPizza();

        Pizza sweetPotatoPizza = factory.createPizza(Topping.SWEETPOTATO);
        sweetPotatoPizza.whatIsPizza();
    }

}
