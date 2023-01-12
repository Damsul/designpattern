package decorator.backstar;

public class Syrup extends Decorator {
    public Syrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return "시럽";
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
