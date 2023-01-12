package facade.bootprocess.subsystem;

public class Power {
    public boolean electric;

    public void SwitchOn() {
        electric = true;
        System.out.println("전력 공급");
    }

    public void SwitchOff() {
        electric = false;
        System.out.println("전력 공급 해제");
    }

}
