package computer;

public class LuxuryBuilder extends Builder {
    Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("Intel");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("32GB");
    }

    @Override
    public void buildDisk() {
        computer.setMemory("2TB");
    }

    @Override
    public Computer getProduct() {
        return computer;
    }
}
