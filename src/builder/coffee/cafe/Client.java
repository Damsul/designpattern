package builder.coffee.cafe;

public class Client {

    public static void main(String[] args) {
        CoffeeDirector barista = new CoffeeDirector(new DefaultCoffeeBuilder());
        Coffee americano = barista.americano();
        System.out.println("아메리카노 " + americano.toString());

        Coffee vanillaLatte = barista.vanillaLatte();
        System.out.println("바닐라라떼 " + vanillaLatte.toString());

        CoffeeBuilder builder = new DefaultCoffeeBuilder();
        Coffee latte = builder.base("espresso")
                                .liquid("milk")
                                .price(3500)
                                .build();
        System.out.println("라뗴 : " + latte.toString());
    }
}
