package Strategy;

public abstract class Character {
    WeaponBehavior weaponBehavior;
    MoveBehavior moveBehavior;
    
    public void performAttack() {
        this.weaponBehavior.attack();
    }
    public void performMove() {
        this.moveBehavior.move();
    }

    public void setWeapon(WeaponBehavior weapon) {
        String before = getWeaponType();
        this.weaponBehavior = weapon;
        String after = getWeaponType();
        System.out.println(before + " -> " + after + " | 무기 변경 완료.");
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public String getWeaponType() {
        return this.weaponBehavior.getWeaponType();
    }

    public abstract String getJobClass();

    /*AttackBehavior attackBehavior;
    public void performAttack() {
        this.attackBehavior.attack();
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }*/

    /*public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }*/
}
