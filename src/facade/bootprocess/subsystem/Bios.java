package facade.bootprocess.subsystem;

public class Bios {
    public boolean run;
    public boolean post() {
        //하드웨어 장치들(CPU를 제외한 메모리, 디스크)를 검사하는 POST(Power On Self Test) 과정을 진행
        if (!HardDiskDrive.status) {
            return false;
        }
        if (!RandomAccessMemory.status) {
            return false;
        }
        if (!ReadOnlyMemory.status) {
            return false;
        }
        return true;
    }

    public BootLoader getBootLoader(ReadOnlyMemory rom) {
        return new BootLoader();
    }

    public void findHdd() {

    }
}
