package abstract_factory.laptop;

public class Client {
    public static void main(String[] args) {
        Order order = new OrderLaptop();
        LaptopFactory factory = order.request("LgGram");
        Laptop gram = factory.createLaptop();
        gram.powerOn();
        gram.playGame();

        System.out.println("------------------------------");
        factory = order.request("MacBook");
        Laptop macBook = factory.createLaptop();
        macBook.powerOn();
        macBook.playGame();
    }
}