package builder.pizza;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza.Builder()
            .name("불고기피자")
            .dough("thin")
            .sauce("hot")
            .topping("peperoni")
            .price(20000)
            .build();

        System.out.println(pizza.toString());
    }
}