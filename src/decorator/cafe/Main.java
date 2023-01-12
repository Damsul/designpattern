package decorator.cafe;

public class Main {

    public static void main(String[] args) {
        Beverage water = new Water();
        water.printPrice();

        Beverage milk = new Milk();
        milk.printPrice();

        Beverage espresso = new Espresso();
        espresso.printPrice();

        Beverage americano = new Americano(espresso, water);
        americano.printPrice();

        Beverage caffeLatte = new CaffeLatte(espresso, milk);
        caffeLatte.printPrice();

        Beverage caffeMocha = new CaffeMocha(espresso, 500);
        caffeMocha.printPrice();

    }

}
