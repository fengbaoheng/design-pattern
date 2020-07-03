package uml;

/**
 * 抽象建造者
 * 负责创建产品各部分
 */
public abstract class Builder {
    /**
     * 产品A部分的建造函数
     */
    public abstract void buildPartA();

    /**
     * 产品B部分的建造函数
     */
    public abstract void buildPartB();

    /**
     * 产品C部分的建造函数
     */
    public abstract void buildPartC();

    public abstract Product getResult();
}
