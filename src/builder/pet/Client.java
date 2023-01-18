package builder.pet;

public class Client {

    public static void main(String[] args) {
        People people = new People();
        ComputerBuilder gamePC = new GameComputer();

        people.setComputerBuilder(gamePC);
        people.constructComputer();

        Computer computer = people.getComputer();
        System.out.println("CPU : " + computer.getCpu());
        System.out.println("VGA : " + computer.getVga());
        System.out.println("RAM : " + computer.getRam() + "GB");
    }

}
