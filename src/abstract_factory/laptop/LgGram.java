package abstract_factory.laptop;

public class LgGram implements Laptop{
    @Override
    public void powerOn() {
        System.out.println("LG 그램 전원 On!");
    }

    @Override
    public void playGame() {
        System.out.println("LG 그램으로 게임하기");
    }

    @Override
    public void work() {
        System.out.println("LG 그램으로 작업하기");
    }
}