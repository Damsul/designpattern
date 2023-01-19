package builder.coffee.cafe;

public class Coffee {
    private final String base;
    private final String liquid;
    private final String syrup;
    private final int price;


    public Coffee(String base, String liquid, String syrup, int price) {
        this.base = base;
        this.liquid = liquid;
        this.syrup = syrup;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee [" +
            "base='" + base + '\'' +
            ", liquid='" + liquid + '\'' +
            ", syrup='" + syrup + '\'' +
            ", price=" + price +
            ']';
    }
}
