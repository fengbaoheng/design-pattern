package uml;

/**
 * 导演
 * 安排建造顺序
 */
public class Director {
    public void Construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
