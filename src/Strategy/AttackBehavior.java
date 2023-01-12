package Strategy;

public interface AttackBehavior {
    void attack();
}

class SwordAttack implements AttackBehavior{
    @Override
    public void attack() {
        System.out.println("칼로 공격");
    }
}

class AxeAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("도끼로 공격");
    }
}