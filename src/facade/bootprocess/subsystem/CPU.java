package facade.bootprocess.subsystem;

public class CPU {
    public boolean electric;
    public void supply(MainBoard mainBoard) {
        this.electric = mainBoard.electric;
        System.out.println("CPU 전력 공급");
    }

    public Bios getBios(ReadOnlyMemory rom) {
        System.out.println("BIOS 실행");
        return rom.bios;
    }
}
