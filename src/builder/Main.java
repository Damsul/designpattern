package builder;

import builder.PizzaBuilder;

public class Main {

    public static void main(String[] args) {

        PizzaBuilder pizza = new PizzaBuilder.Builder()
            .name("불고기피자")
            .dough("thin")
            .sauce("hot")
            .topping("peperoni")
            .price(20000)
            .build();

        System.out.println(pizza.toString());
    }
}