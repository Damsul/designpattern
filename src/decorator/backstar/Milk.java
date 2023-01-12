package decorator.backstar;

public class Milk extends Decorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return "우유";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1000;
    }

    @Override
    public String add() {
        return super.add() + " + " + getName();
    }
}
