package builder.pet;

public class People {

    ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer() {
        return this.computerBuilder.getComputer();
    }

    public void constructComputer() {
        computerBuilder.makeComputer();
        computerBuilder.buildCpu();
        computerBuilder.buildVga();
        computerBuilder.buildRam();
    }

}
