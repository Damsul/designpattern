package builder;

public class PizzaBuilder {

    private final String name;
    private final String dough;
    private final String sauce;
    private final String topping;
    private final int price;


    public static class Builder {

        private String name;
        private String dough;
        private String sauce;
        private String topping;
        private int price;

//        public Builder name(String name) {
//            this.name = name;
//            return this;
//        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public PizzaBuilder build() {
            return new PizzaBuilder(this);
        }
    }

    public PizzaBuilder(Builder builder) {
        this.name = builder.name;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return name + ", " + dough + ", " + sauce + ", " + topping + ", " + price + "주문받았습니다.";
    }

}
