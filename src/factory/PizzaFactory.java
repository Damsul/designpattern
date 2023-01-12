package factory;

public class PizzaFactory {
    public Pizza createPizza(Topping topping) {
        if (topping.isCheese()) {
            return new CheesePizza();
        }
        if (topping.isPotato()) {
            return new PotatoPizza();
        }
        if (topping.isSweetPotato()) {
            return new SweetPotatoPizza();
        }

        throw new RuntimeException("메뉴에 없는 피자입니다.");
    }

}
