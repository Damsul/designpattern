package builder.pizza;

// GOF Builder Pattern 과 Lombok builder ㅡ랑은 다름
public class Pizza {

    private final String name;
    private final String dough;
    private final String sauce;
    private final String topping;
    private final int price;

    public Pizza(Builder builder) {
        this.name = builder.name;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
        this.price = builder.price;
    }


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

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return name + ", " + dough + ", " + sauce + ", " + topping + ", " + price + "주문받았습니다.";
    }

}
