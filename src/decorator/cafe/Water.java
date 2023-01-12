package decorator.cafe;

public class Water implements Beverage {

    @Override
    public String getName() {
        return "물";
    }

    @Override
    public int getPrice() {
        return 500;
    }


}
