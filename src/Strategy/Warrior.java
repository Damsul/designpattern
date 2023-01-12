package Strategy;

public class Warrior extends Character {
    String jobClass = "전사";
    public Warrior(WeaponBehavior weapon) {
        weaponBehavior = weapon;
        moveBehavior = new WalkBehavior();
    }

    @Override
    public String getJobClass() {
        return jobClass;
    }
}
