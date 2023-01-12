package Strategy;

public interface MoveBehavior {
    void move();
}

class WalkBehavior implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("걸어서 이동");
    }
}

class RunBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("달려서 이동");
    }
}