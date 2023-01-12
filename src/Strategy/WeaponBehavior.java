package Strategy;

public interface WeaponBehavior {
    void attack();
    String getWeaponType();
}

class Sword implements WeaponBehavior {
    String type = "대검";

    @Override
    public void attack() {
        System.out.println("칼로 공격!");
    }

    @Override
    public String getWeaponType() {
        return type;
    }
}

class Axe implements WeaponBehavior {
    String type = "도끼";

    @Override
    public void attack() {
        System.out.println("도끼로 공격!");
    }

    @Override
    public String getWeaponType() {
        return type;
    }
}