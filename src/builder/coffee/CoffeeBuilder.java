package builder.coffee;

public abstract class CoffeeBuilder {

    Coffee coffee;

    public Coffee getCoffee() {
        return coffee;
    }

    public void makeCoffee() {
        coffee = new Coffee();
    }

    public abstract void buildLiquid();
    public abstract void buildBeans();
    public abstract void buildSyrup();

}
