package builder.coffee;

public class Client {

    public static void main(String[] args) {
        Barista barista = new Barista();
        CoffeeBuilder vanillaLatteBuilder = new VanillaLatteBuilder();

        barista.setCoffeeBuilder(vanillaLatteBuilder);
        barista.constructCoffee();

        Coffee vanillaLatte = barista.getCoffee();
        System.out.println("액체 : " + vanillaLatte.getLiquid());
        System.out.println("원두 : " + vanillaLatte.getBeans());
        System.out.println("시럽 : " + vanillaLatte.getSyrup());
    }

}
