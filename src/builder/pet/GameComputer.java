package builder.pet;

public class GameComputer extends ComputerBuilder{

    @Override
    public void buildCpu() {
        computer.setCpu("게임용 CPU");
    }

    @Override
    public void buildVga() {
        computer.setVga("게임용 VGA");
    }

    @Override
    public void buildRam() {
        computer.setRam(32);
    }
}
