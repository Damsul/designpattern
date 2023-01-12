package facade.bootprocess.subsystem;

public class HardDiskDrive {
    public boolean electric;
    public static boolean status = true;
    public void supply(MainBoard mainBoard) {
        this.electric = mainBoard.electric;
        System.out.println("HDD 전력 공급");
    }
}
