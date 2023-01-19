package builder.coffee.cafe;

public class DefaultBeverageBuilder implements CoffeeBuilder {
    private String base;
    private String liquid;
    private String syrup;
    private int price;

    @Override
    public CoffeeBuilder base(String base) {
        this.base = base;
        return this;
    }

    @Override
    public CoffeeBuilder liquid(String liquid) {
        this.liquid = liquid;
        return this;
    }

    @Override
    public CoffeeBuilder syrup(String syrup) {
        this.syrup = syrup;
        return this;
    }

    @Override
    public CoffeeBuilder price(int price) {
        this.price = price;
        return this;
    }

    @Override
    public Coffee build() {
        return new Coffee(base, liquid, syrup, price);
    }

}
