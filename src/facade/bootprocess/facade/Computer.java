package facade.bootprocess.facade;

import facade.bootprocess.subsystem.Bios;
import facade.bootprocess.subsystem.BootLoader;
import facade.bootprocess.subsystem.CPU;
import facade.bootprocess.subsystem.HardDiskDrive;
import facade.bootprocess.subsystem.MainBoard;
import facade.bootprocess.subsystem.OperationSystem;
import facade.bootprocess.subsystem.Power;
import facade.bootprocess.subsystem.RandomAccessMemory;
import facade.bootprocess.subsystem.ReadOnlyMemory;

public class Computer {

    private final Power power = new Power();
    private final MainBoard mainBoard = new MainBoard();
    private final CPU cpu = new CPU();
    private final ReadOnlyMemory rom = new ReadOnlyMemory();
    private final RandomAccessMemory ram = new RandomAccessMemory();
    private final HardDiskDrive hdd = new HardDiskDrive();


    public void on() {
        // 전원 On
        power.SwitchOn();
        // 메인보드 전력 공급
        mainBoard.supply(power);
        // 메인보드에 장착된 장치들(CPU, 메모리, 디스크)에도 전력 공급
        cpu.supply(mainBoard);
        ram.supply(mainBoard);
        rom.supply(mainBoard);
        hdd.supply(mainBoard);
        // cpu 가 rom(read only memory)에 저장된 BIOS 실행
        Bios bios = cpu.getBios(rom);
        // 하드웨어 장치들(CPU 를 제외한 메모리, 디스크)를 검사하는 POST(Power On Self Test) 과정을 진행
        if (!bios.post()) {
            System.out.println("장치 불량");
            return;
        }
        // 부팅할 수 있는 보조기억장치(HDD) 선택
        // 부트로더(Boot Loader) 실행
        BootLoader bootLoader = bios.getBootLoader(rom);
        OperationSystem os = bootLoader.findOperationSystem(hdd);
        // ram 에 OS 적재(load)
        ram.load(os);
    }

    public void off() {

    }

}
