package decorator.backstar;



public class BackStar {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println("에스프레소 : " + espresso.add());
        espresso.printPrice();

        Beverage americano = new Water(espresso);
        System.out.println("아메리카노 : " + americano.add());
        americano.printPrice();

        Beverage caffeLatte = new Milk(espresso);
        System.out.println("카페라떼 : " + caffeLatte.add());
        caffeLatte.printPrice();

        Beverage chocoLatte = new Milk(espresso);
        chocoLatte = new Syrup(chocoLatte);
        System.out.println("초코라떼 : " + chocoLatte.add());
        chocoLatte.printPrice();

    }
}
