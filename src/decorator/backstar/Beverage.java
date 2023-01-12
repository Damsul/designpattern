package decorator.backstar;

public interface Beverage {

    String getName();
    int getPrice();
    String add();

    default void printPrice() {
        System.out.println("가격 " + getPrice() + "원");
    }

}
