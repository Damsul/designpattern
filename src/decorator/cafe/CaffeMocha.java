package decorator.cafe;

public class CaffeMocha implements Beverage {
    private final Beverage espresso;
    private final int syrupPrice;

    public CaffeMocha(Beverage espresso, int syrupPrice) {
        this.espresso = espresso;
        this.syrupPrice = syrupPrice;
    }

    @Override
    public String getName() {
        return "카페모카";
    }

    @Override
    public int getPrice() {
        return espresso.getPrice() + syrupPrice;
    }
}
