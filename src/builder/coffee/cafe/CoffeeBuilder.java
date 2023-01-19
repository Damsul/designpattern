package builder.coffee.cafe;

public interface CoffeeBuilder {
    CoffeeBuilder base(String base);
    CoffeeBuilder liquid(String liquid);
    CoffeeBuilder syrup(String syrup);
    CoffeeBuilder price(int price);
    Coffee build();
}

