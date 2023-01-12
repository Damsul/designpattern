package decorator.backstar;

public class Water extends Decorator {
    public Water(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return "물";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 500;
    }

    @Override
    public String add() {
        return super.add() + " + " +getName();
    }
}
