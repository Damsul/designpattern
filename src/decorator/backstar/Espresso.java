package decorator.backstar;

public class Espresso implements Beverage {
    @Override
    public String getName() {
        return "에스프레소";
    }

    @Override
    public int getPrice() {
        return 2000;
    }

    @Override
    public String add() {
        return getName();
    }
}
