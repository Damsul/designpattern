package decorator.backstar;

abstract public class Decorator implements Beverage {
    private final Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String add() {
        return beverage.add();
    }

    @Override
    public int getPrice() {
        return beverage.getPrice();
    }
}
