package abstract_factory.phone;

public class AndroidPhone implements Phone{

    @Override
    public void call() {
        System.out.println("안드로이드폰으로 전화걸기");
    }

    @Override
    public void playGame() {
        System.out.println("안드로이드폰으로 게임하기");
    }
}
