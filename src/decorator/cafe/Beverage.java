package decorator.cafe;

public interface Beverage {

    String getName();

    int getPrice();

    default void printPrice() {
        System.out.println(getName() + " 가격은 " + getPrice() + "원");
    }


}
