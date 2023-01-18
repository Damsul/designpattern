package builder.coffee;

public class Barista {

    private CoffeeBuilder coffeeBuilder;

    public void setCoffeeBuilder(CoffeeBuilder coffeeBuilder) {
        this.coffeeBuilder = coffeeBuilder;
    }

    public Coffee getCoffee() {
        return coffeeBuilder.getCoffee();
    }

    public void constructCoffee() {
        coffeeBuilder.makeCoffee();
        coffeeBuilder.buildLiquid();
        coffeeBuilder.buildBeans();
        coffeeBuilder.buildSyrup();
    }

}
