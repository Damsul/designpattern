package facade.bootprocess.subsystem;

public class RandomAccessMemory {
    public boolean electric;
    public static boolean status = true;
    public void supply(MainBoard mainBoard) {
        this.electric = mainBoard.electric;
        System.out.println("RAM 전력 공급");
    }

    public void load(OperationSystem os) {
        System.out.println("RAM<-OS 적재");
    }
}
