package abstract_factory.laptop;

public class MacBook implements Laptop{
    @Override
    public void powerOn() {
        System.out.println("맥북 전원 On!");
    }

    @Override
    public void playGame() {
        System.out.println("맥북으로 게임하기");
    }

    @Override
    public void work() {
        System.out.println("맥북으로 작업하기");
    }
}