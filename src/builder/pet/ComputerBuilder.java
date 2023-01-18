package builder.pet;

public abstract class ComputerBuilder {

    Computer computer;

    Computer getComputer() {
        return this.computer;
    }

    public void makeComputer() {
        this.computer = new Computer();
    }

    public abstract void buildCpu();
    public abstract void buildVga();
    public abstract void buildRam();

}
