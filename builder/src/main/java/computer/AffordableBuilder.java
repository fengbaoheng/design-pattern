package computer;

public class AffordableBuilder extends Builder {
    Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("AMD");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("8GB");
    }

    @Override
    public void buildDisk() {
        computer.setMemory("512GB");
    }

    @Override
    public Computer getProduct() {
        return computer;
    }
}
