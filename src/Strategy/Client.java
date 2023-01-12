package Strategy;

public class Client {
    public static void main(String[] args) {
        Character warrior = new Warrior(new Sword());
        System.out.println("직업 : " +warrior.getJobClass());
        System.out.println("무기 : " + warrior.getWeaponType());
        warrior.performAttack();
        warrior.performMove();
        System.out.println();

        warrior.setWeapon(new Axe());
        warrior.setMoveBehavior(new RunBehavior());
        System.out.println("직업 : " +warrior.getJobClass());
        System.out.println("무기 : " + warrior.getWeaponType());
        warrior.performAttack();
        warrior.performMove();
    }
}
