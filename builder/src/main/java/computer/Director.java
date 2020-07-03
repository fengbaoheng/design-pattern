package computer;

public class Director {
    public void construct(Builder builder) {
        builder.buildCpu();
        builder.buildMemory();
        builder.buildDisk();
    }
}
