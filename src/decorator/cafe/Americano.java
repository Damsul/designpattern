package decorator.cafe;

public class Americano implements Beverage {
    private final Beverage espresso;
    private final Beverage water;
    public Americano(Beverage espresso, Beverage water) {
        this.espresso = espresso;
        this.water = water;
    }

    @Override
    public String getName() {
        return "아메리카노";
    }

    @Override
    public int getPrice() {
        return water.getPrice() + espresso.getPrice();
    }
}
