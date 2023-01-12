package decorator.cafe;

public class CaffeLatte implements Beverage {
    private final Beverage espresso;
    private final Beverage milk;
    public CaffeLatte(Beverage espresso, Beverage milk) {
        this.espresso = espresso;
        this.milk = milk;
    }

    @Override
    public String getName() {
        return "카페라떼";
    }

    @Override
    public int getPrice() {
        return espresso.getPrice() + milk.getPrice();
    }
}
