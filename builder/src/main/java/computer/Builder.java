package computer;

/**
 * 电脑组装类
 * 抽象建造者
 */
public abstract class Builder {

    public abstract void buildCpu();

    public abstract void buildMemory();

    public abstract void buildDisk();

    public abstract Computer getProduct();
}
