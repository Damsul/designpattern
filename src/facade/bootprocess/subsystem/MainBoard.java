package facade.bootprocess.subsystem;

public class MainBoard {
    public boolean electric;
    public void supply(Power power) {
        this.electric = power.electric;
        System.out.println("메인보드에 전력 공급");
    }


}
