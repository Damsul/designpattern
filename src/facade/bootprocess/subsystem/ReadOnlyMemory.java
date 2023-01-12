package facade.bootprocess.subsystem;

public class ReadOnlyMemory {
    public boolean electric;
    public static boolean status = true;
    public Bios bios = new Bios();
    public void supply(MainBoard mainBoard) {
        this.electric = mainBoard.electric;
        System.out.println("ROM 전력 공급");
        bios = new Bios();
    }
}
