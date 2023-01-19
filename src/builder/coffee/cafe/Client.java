package builder.coffee.cafe;

public class Client {

    public static void main(String[] args) {
        CoffeeDirector barista = new CoffeeDirector(new DefaultBeverageBuilder());
        Coffee americano = barista.americano();
        System.out.println("아메리카노 " + americano.toString());

        Coffee vanillaLatte = barista.vanillaLatte();
        System.out.println("바닐라라떼 " + vanillaLatte.toString());
    }

}
