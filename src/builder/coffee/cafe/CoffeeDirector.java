package builder.coffee.cafe;

public class CoffeeDirector {

    private final CoffeeBuilder coffeeBuilder;

    public CoffeeDirector(CoffeeBuilder coffeeBuilder) {
        this.coffeeBuilder = coffeeBuilder;
    }

    public Coffee americano() {
        return coffeeBuilder.base("espresso")
            .liquid("water")
            .price(2500)
            .build();
    }

    public Coffee vanillaLatte() {
        return coffeeBuilder.base("espresso")
            .liquid("milk")
            .syrup("vanillaSyrup")
            .price(4000)
            .build();
    }
}
